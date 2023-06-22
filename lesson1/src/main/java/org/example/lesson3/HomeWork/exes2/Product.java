package org.example.lesson3.HomeWork.exes2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private String title;
    private String country;
    private Double weight;
    private Double price;
    private Integer grade;
}
