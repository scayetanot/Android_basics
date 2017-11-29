package com.droidrank.sample;

import java.io.Serializable;

/**
 * Created by sebastien on 11/29/17.
 */

public final class Person implements Serializable {

    public String firstName;
    public String lastName;
    public String email;
    public String address;
    public String city;
    public String state;
    public String zipCode;


    public Person(String firstName, String lastName, String email,
                  String address, String city, String state,
                  String zipCode){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getName(){
        return lastName;
    }

}
