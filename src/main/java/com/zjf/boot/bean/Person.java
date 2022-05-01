package com.zjf.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@ToString
@AllArgsConstructor
@Data
public class Person {

    private String userName;
    private Integer age;
    private Date birth;
    private Pet pet;


}
