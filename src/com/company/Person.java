package com.company;

public class Person {
    private String name;
    private String designation;//должность

    public Person() {}
    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }


    void walk (String c){
        System.out.println(c + " walking");
    }
    void learn (String b){
        System.out.println(b + " learning");
    }

    void eat (String a){

        System.out.println(a + " eating");
    }

    @Override
    public String toString() {
        return "Persons " +
                "name is: " + name + ",\n"+
                name + " designation is: " + designation;
    }
}
