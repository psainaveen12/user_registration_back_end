package com.Fullstackwebapp.Fullstackwebapp1.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "user_reg_tbl1")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String username;
    private String name;
    private String email;
    private Long phonenumber;
    private LocalDate date;
    private String time;

}
