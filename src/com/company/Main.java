package com.company;

import java.awt.image.DataBuffer;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Person person = new Person("Jake","buhgalter");
    System.out.println("person:");
    System.out.println(person);
    person.setName("Jake");
    person.walk(person.getName());
    person.eat(person.getName());
    person.learn(person.getName());

    System.out.println("\nprogrammer: ");
    Programmer programmer = new Programmer("Tom","veb-developer","Google");
        System.out.println(programmer);
        programmer.codding();
        programmer.walk(programmer.getName());
        programmer.eat(programmer.getName());
        programmer.learn(programmer.getName());

    System.out.println("\ndancer: \nenter dancers name, designation and group name:");
        Dancer dancer =new Dancer();
        dancer.setName(scanner.next());
        dancer.setDesignation(scanner.next());
        dancer.setGroupName(scanner.next());
        System.out.println(dancer);
        dancer.dancing();
        dancer.walk(dancer.getName());
        dancer.eat(dancer.getName());
        dancer.learn(dancer.getName());

        System.out.println("\nsinger: \nenter singers name, designation and band group:");
        Singer singer = new Singer();
        singer.setName(scanner.next());
        singer.setDesignation(scanner.next());
        singer.setBandName(scanner.next());
        System.out.println(singer);
        singer.singing();
        singer.playGuitar();
        singer.walk(singer.getName());
        singer.eat(singer.getName());
        singer.learn(singer.getName());
    }
}