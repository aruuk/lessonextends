package com.company;

public class Dancer extends Person{
    private String groupName;

    public Dancer(){}
    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    void dancing (){
        System.out.println(getName()+" dancing");
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return  "dancer name is: "+getName()+",\n"+
                getName()+" designation is: "+ getDesignation()+",\n"+
                getName()+" group name is: " + getGroupName();
    }
}
