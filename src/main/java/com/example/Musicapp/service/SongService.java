package com.example.Musicapp.service;

import com.example.Musicapp.model.Song;

import java.util.List;

public interface SongService {
    public Song saveSong(Song song);
    public List<Song> listSongs();
}
