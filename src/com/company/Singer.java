package com.company;

public class Singer extends Person{
    private String bandName;

    public Singer(){}
    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    void singing(){
        System.out.println(getName()+" singing");
    }
    void playGuitar(){
        System.out.println(getName()+" playing guitar");
    }

    @Override
    public String toString() {
        return "Singers name is: " +getName()+",\n"+
                getName()+" designation is: "+ getDesignation()+",\n"+
                getName()+" band name is: " + getBandName();
    }
}
