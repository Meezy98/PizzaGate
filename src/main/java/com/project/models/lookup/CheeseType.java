package com.project.models.lookup;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Table(name = "cheese_type")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CheeseType {
    @Id
    @GeneratedValue(generator = "auto_increment",strategy = GenerationType.IDENTITY)
    int cheeseID;

    String cheeseType;
}
