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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int ID;
    private String Givenname;
    private String Surname;
    private String Country;
    private String Phonenumber;
    private String Zodiac;
    private String CCType;
    private int CVV2;
    private String CCExpires;
    @Column(name = "Color")
    private String color;
    @Column(name = "Bloodtype")
    private String bloodType;
    private double Kilograms;
    private int Centimeters;
    private String Gender;
    private String Nameset;
    @Column(name = "Countryfull")
    private String countryfull;
    private int Age;
    private String pictureurl;
}
