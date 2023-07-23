package com.example.examapirest.repository;

import com.example.examapirest.dto.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepo extends JpaRepository<Course, Long> {
    List<Course> findByNomClientAndPrenomClient(String nomClient, String prenomClient);
}
