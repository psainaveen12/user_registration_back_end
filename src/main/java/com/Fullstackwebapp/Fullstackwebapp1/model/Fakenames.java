package com.Fullstackwebapp.Fullstackwebapp1.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "fn_1_5k")
public class Fakenames {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;
    private String Givenname;
    private String Surname;
    private String Country;
    private String Phonenumber;
    private String Zodiac;
    private String CCType;
    private int CVV2;
    private String CCExpires;
    private String Color;
    private String Bloodtype;
    private double Kilograms;
    private int Centimeters;
    private String Gender;
    private String Nameset;
    private String Countryfull;
    private int Age;

}
