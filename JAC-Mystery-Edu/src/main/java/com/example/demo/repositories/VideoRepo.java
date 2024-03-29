package com.example.demo.repositories;

import com.example.demo.models.Video;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface VideoRepo extends CrudRepository<Video, Long> {
    Optional<Video> findById(long id);
    Optional<Video> findByTitle(String title);
}
