package org.example.lesson3.ClassWork.Exes1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Item {
    private String name;
    private String country;
    private Integer volume;
}