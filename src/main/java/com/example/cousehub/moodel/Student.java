package com.example.cousehub.moodel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {

    private String firstName;
    private String lastName;
    private int dataAge;
    private String course;
}
