package com.cherry.accounts.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDto {


    private int id;

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private int age;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String city;
    private String country;
    private int pincode;
    

}
