package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class Students {

    Long id;
    String firstName;
    String lastName;
    int age;

}