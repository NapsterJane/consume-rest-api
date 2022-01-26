package com.fresco.apitask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController {
	
	@Autowired
	NewsService newsService;
	
	@GetMapping("/api/news/topstories")
	public  News getNews() throws Exception{
		return newsService.getTopStories();
	}

}
