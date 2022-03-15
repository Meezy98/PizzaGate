package com.project.models.unique;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Table(name = "user_profile")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserProfile {
    @Id
    @GeneratedValue(generator = "auto_increment",strategy = GenerationType.IDENTITY)
    int profileID;
    @OneToOne(cascade = CascadeType.ALL)
    UserCreds userID;
    String firstName;

    String lastName;

    String email;
}
