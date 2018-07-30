package com.study.cloud.model;

import lombok.Data;

@Data
public class Person {
    private Integer id;
    private String name;
    private Integer age;
    private String message;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", message='" + message + '\'' +
                '}';
    }

}
