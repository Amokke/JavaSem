package org.example.lesson3.HomeWork.exes3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private String title;
    private String surname;
    private Double price;
    private Integer year;
    private Integer pages;
}
