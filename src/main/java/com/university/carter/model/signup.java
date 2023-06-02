package com.university.carter.model;

import jakarta.persistence.Column;

public class signup extends idgen{
        @Column
        private String email;
        @Column
        private String password;
    }

