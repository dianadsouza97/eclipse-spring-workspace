package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Album;

public interface AlbumService {
	public List<Album> getAllAlbums();
	public Optional<Album> getAlbumById(int id);
	public void createAlbums(Album theAlbum);
}
