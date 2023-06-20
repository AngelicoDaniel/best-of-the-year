package com.example.bestoftheyear.controller;

import com.example.bestoftheyear.model.Movie;
import com.example.bestoftheyear.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class IndexController {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "Daniel");
        return "index";
    }

    @GetMapping("/movies")
    public String getBestMovies(Model model) {
        List<Movie> movies = getBestMovies();
        model.addAttribute("movies", movies);
        return "movies";
    }

    private List<Movie> getBestMovies() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(1, "You are (Not) Alone"));
        movies.add(new Movie(2, "You Can (Not) Advance"));
        movies.add(new Movie(3, "You Can (Not) Redo"));
        movies.add(new Movie(4, "Thrice Upon a Time"));
        return movies;
    }


    @GetMapping("/songs")
    public String getBestSongs(Model model) {
        List<Song> songs = getBestSongs();
        model.addAttribute("songs", songs);
        return "songs";
    }

    private List<Song> getBestSongs() {
        List<Song> songs = new ArrayList<>();
        songs.add(new Song(1, "Never Gonna Give You Up", "Rick Astley"));
        songs.add(new Song(2, "Sandstorm", "Darude"));
        songs.add(new Song(3, "Hammer Smashed Face", "Cannibal Corpse"));
        return songs;
    }

}