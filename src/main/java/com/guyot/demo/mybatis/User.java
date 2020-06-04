package com.guyot.demo.mybatis;


import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class User {
    private Long id;
    private String name;
    private int age;
    private String address;
}
