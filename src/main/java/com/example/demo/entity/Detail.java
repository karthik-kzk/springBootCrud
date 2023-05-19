package com.example.demo.entity;

import jakarta.persistence.*;


@Entity
@Table(name="detail")
public class Detail {

    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    long id;

    String father;
    String mother;

    public String getFather(){
        return father;
    }

    public String getMother(){
        return mother;
    }

    public void setFather(String father){
        this.father=father;
    }

    public void setMother (String mother){
        this.mother=mother;
    }

    public long getId(){
        return id;
    }

    public void setId(){
        this.id=id;
    }
}
