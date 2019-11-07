package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AlbumRepository;
import com.example.demo.entity.Album;
@Service
@Transactional
public class AlbumServiceImpl implements AlbumService {
	@Autowired
	private AlbumRepository albumRepository;
	public List<Album> getAllAlbums(){
		return albumRepository.findAll();
		
	}
	public void createAlbums(Album theAlbum) {
		albumRepository.save(theAlbum);
	}
	public Optional<Album> getAlbumById(int id){
		 Optional<Album> album=albumRepository.findById(id);
		 return album;
	}
}
