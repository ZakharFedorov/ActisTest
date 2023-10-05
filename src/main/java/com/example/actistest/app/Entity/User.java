package com.example.actistest.app.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CurrentTimestamp;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String email;
    private boolean verified;
    @CurrentTimestamp
    private Timestamp date_created;
    private int phone_number;
    private double height;


    public User() {
    }


}
