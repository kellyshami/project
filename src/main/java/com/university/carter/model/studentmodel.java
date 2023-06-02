package com.university.carter.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class studentmodel extends idgen{

        @Column
        private String fname;
        @Column
        private String lname;
        @Column
        private String pnumber;
        @Column
        private String address;
        @Column
        private String email;
        @Column
        private String password;
        @Column
        private String confpassword;

}
