package com.example.satveer_final_assignment_android;

public class Person {
    int id;

    String firstname , lastname , address , phone ;

    public Person(int id, String firstname, String lastname, String address, String phone) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }
}
