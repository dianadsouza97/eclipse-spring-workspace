package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.example.demo.dao.AlbumRepository;
import com.example.demo.dao.ImageRepository;
import com.example.demo.entity.Album;
import com.example.demo.entity.Image;

@SpringBootApplication
public class SpringBootSpringjpaH2mysqlApplication {

	private AlbumRepository albumRepository;
	private ImageRepository imageRepository;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootSpringjpaH2mysqlApplication.class, args);
	}
	
	public SpringBootSpringjpaH2mysqlApplication(AlbumRepository albumRepository, ImageRepository imageRepository) {
		super();
		this.albumRepository = albumRepository;
		this.imageRepository = imageRepository;
	}

	@Component
	 class CourseCommand implements CommandLineRunner {

		@Override
		public void run(String... args) throws Exception {
			List<Image> list=new ArrayList<Image>();
			Image tempImage=new Image();
			Album tempAlbum=new Album();
			tempAlbum.setAlbumName("Sayonara");
			tempImage.setType("jpg");
			tempImage.setUrl("qwerty");
			tempImage.setAlbum(tempAlbum);
			list.add(tempImage);
			tempAlbum.setImage(list);
			albumRepository.save(tempAlbum);
			imageRepository.save(tempImage);
		}
		
	}

	
}
