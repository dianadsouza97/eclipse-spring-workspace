package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Image;

public interface ImageService {
	public List<Image> getAllImages();
	public Optional<Image> getImageById(int id);
	void createImages(Image theImage);
}
