package org.example.lesson3.ClassWork.Exes2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
    private String name;
    private int groupNumber;
    private int salary;
    private List<Integer> scores;
}
