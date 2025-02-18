package com.transport.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Random;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private String phoneNumber;
    private String password;
    private String emailId;
    private Boolean isEmailVerified;
    private String emailToken;

//    @OneToMany(mappedBy="uniqueUserId", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    List<Organisation> organisations;

    public int maxAttack() {
        Random rnd = new Random();
        int rand_int1 = rnd.nextInt(1000000000);
        return rand_int1;
    }

    public String getRandomString() {
        return "U" + maxAttack();
    }
}
