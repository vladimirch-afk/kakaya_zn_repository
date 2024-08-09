package com.example.demo.data.repository;

import com.example.demo.data.model.entities.Video;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VideoRepository extends CrudRepository<Video, Integer> {
    List<Video> returnAllVideos();
    Video findVideoByURL(String url);
    Video findVideoByTitle(String title);
    List<Video> findVideosByCourse(String course);
}
