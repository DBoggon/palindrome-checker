package com.example.giphy.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.giphy.model.Gif;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class GiphyService {
	
	@Value("${giphy.api.url}")
	private String apiUrl;
	@Value("${giphy.api.key}")
	private String key;

	public List<Gif> getSearchResults(String searchString) {

		String url = apiUrl + key + "&limit=10&q=" + searchString;
		HttpEntity<String> httpEntity = new HttpEntity<>("");
		RestTemplate restTemplate = new RestTemplate();
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode jsonNode;
		List<Gif> gifList = new ArrayList<Gif>();

		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, httpEntity, String.class);

		try {
			jsonNode = objectMapper.readTree(response.getBody());

			for (int i = 0; i < jsonNode.path("data").size(); i++) {
				String gifUrl = jsonNode.path("data").path(i).path("images").path("original").path("url").toString();
				String title = jsonNode.path("data").path(i).path("title").toString();
				String username = jsonNode.path("data").path(i).path("username").toString();

				Gif gif = new Gif(gifUrl, username, title);
				gifList.add(gif);
			}

		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		return gifList;

	}

}
