package com.project.models.lookup;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Table(name = "side_items")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class SideItems {
    @Id
    @GeneratedValue(generator = "auto_increment", strategy = GenerationType.IDENTITY)
    int sideID;

    String side_items;
}
