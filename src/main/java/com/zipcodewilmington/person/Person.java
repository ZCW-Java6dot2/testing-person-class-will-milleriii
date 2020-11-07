package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {

    private String name;
    private int age;
    private String hairColor;
    private String eyeColor;
    private Object height;
    private Object facialHair;
    private Object vegetarian;

    public Person() {
        name = "";
        age = Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        
        return name;
    }

    public Integer getAge() {

        return age;
    }

    public void setHairColor(String expected) {
        hairColor = expected;
    }

    public String getHairColor(){
        return hairColor;
    }




    public void setEyeColor(String expected) {
        eyeColor = expected;
    }

    public String getEyeColor(){
        return eyeColor;
    }

    public void setHeight(Double expected) {
        height = expected;
    }

    public Double getHeight() {
        return (Double) height;
    }

    public void setFacialHair(Boolean expected) {
        facialHair = expected;
    }

    public Boolean getFacialHair() {
        return (Boolean) facialHair;
    }


    public void setVegetarian(Boolean expected) {
        vegetarian = expected;
    }

    public Boolean getVegetarian() {
        return (Boolean) vegetarian;
    }
}
