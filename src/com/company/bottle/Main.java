package com.company.bottle;



public class Main {
    public static void main(String[] args) {

        Person john_smith = new Person("John Smith");
        Person sarah_connor = new Person("Sarah Connor");
        john_smith.setFirstName("patrick");
        System.out.println(john_smith.getFirstName());
        System.out.println(sarah_connor.getFullName());
    }
}