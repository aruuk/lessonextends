package com.company;

public class Programmer extends Person{
    private String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    void codding(){
        System.out.println(getName()+" codding");
    }

    @Override
    public String toString() {
        return  "programmer name is: "+ getName() + ",\n"+
                getName()+" designation is: " +getDesignation()+",\n"+
                getName() + " company name: " + companyName;
    }
}
