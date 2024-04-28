package com.sriraam.sporfy.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="login_details")
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @Column(name= "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;

    @Column(name= "username")
    private String username;

    @Column(name= "email_id")
    private String email_id;

    @Column(name="password")
    private String password;

}
