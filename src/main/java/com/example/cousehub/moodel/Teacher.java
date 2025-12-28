package com.example.cousehub.moodel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Teacher {

    private String firstName;
    private String midName;
    private String lastName;
    private int age;
    private String course;
}
