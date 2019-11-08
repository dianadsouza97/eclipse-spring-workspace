package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Album;
import com.example.demo.entity.Image;
import com.example.demo.service.AlbumService;
import com.example.demo.service.ImageService;

@RestController
@RequestMapping("/api")
public class HomeController {
	@Autowired
	private AlbumService albumService;
	@Autowired
	private ImageService imageService;
	@GetMapping("/album")
	public List<Album> albumlist()

	{
		return albumService.getAllAlbums();
	}
	
	@PostMapping("/album")
	public void createAlbum(@RequestBody Album theAlbum) {
		albumService.createAlbums(theAlbum);
	}
	@GetMapping("/album/{id}")
	public Optional<Album> getAlbumById(@PathVariable int id)
	{
		return albumService.getAlbumById(id);
	}
	
	
	
	
	
	
	@GetMapping("/image")
	public List<Image> imagelist(){
		return imageService.getAllImages();
	}
	@PostMapping("/image")
	public void createImage(@RequestBody Image theImage) {
		imageService.createImages(theImage);
	}
	@GetMapping("/image/{id}")
	public Optional<Image> getImageById(@PathVariable int id)
	{
		return imageService.getImageById(id);
	}
	
	
}
