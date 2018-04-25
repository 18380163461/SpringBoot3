package com.example.demo.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Description:
 * @author: youpd@asiainfo.com
 */
@Entity
public class User implements Serializable {
    private static final long serialVersionUID = -6286491574599808822L;

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public User(Long id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public User() {
    }

}