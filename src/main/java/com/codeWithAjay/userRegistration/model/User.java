package com.codeWithAjay.userRegistration.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="useregister")
public class User {

    private String name;
    @Id
    private String username;
    private String email;
    private String phone;
    private String password;
    private String cpassword;
    private String gender;

}
