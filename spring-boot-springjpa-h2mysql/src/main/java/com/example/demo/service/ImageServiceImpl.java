package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ImageRepository;
import com.example.demo.entity.Image;

@Service
@Transactional
public class ImageServiceImpl implements ImageService {
	@Autowired
	private ImageRepository imageRepository;

	@Override
	public List<Image> getAllImages() {
		return imageRepository.findAll();
	}

	@Override
	public Optional<Image> getImageById(int id) {
		Optional<Image> image = imageRepository.findById(id);
		return image;
	}

	@Override
	public void createImages(Image theImage) {
		imageRepository.save(theImage);
	}

	
}
