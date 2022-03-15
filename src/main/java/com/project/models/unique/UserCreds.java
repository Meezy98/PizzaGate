package com.project.models.unique;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Table(name = "user_creds")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCreds {
    @Id
    @GeneratedValue(generator = "auto_increment",strategy = GenerationType.IDENTITY)
    int userID;
    String userName;
    String password;
}
