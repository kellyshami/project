package com.university.carter.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class idgen{
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
    }

