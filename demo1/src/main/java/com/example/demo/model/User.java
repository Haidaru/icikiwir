package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "User")
public class User {
    private Long id;
    private String name;
    private String email;
    private String status;
    private String rfid;
    private String fingerid;
    private String faceid;
    private String phone;

}
