package com.devsuperior.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslearnbds.entites.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

}
