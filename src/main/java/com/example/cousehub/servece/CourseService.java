package com.example.cousehub.servece;

import com.example.cousehub.moodel.Course;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CourseService {

    private final List<Course> courses = new ArrayList<>();

}
