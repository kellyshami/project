package com.university.carter.service;

import com.university.carter.model.signup;
import com.university.carter.repository.signuprepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
    public class implementsignup implements signupservice{


        @Autowired
        public signuprepo signuprepo;

        @Override
        @Transactional(rollbackOn = Exception.class)
        public signup saveAccount(signup signup) {
            return signuprepo.saveStudent();
        }
        @Override
        public signup findAccount(Long id) {
            signup existingArtist = signuprepo.find.orElse(null);
            if (existingArtist != null) {
                return existingArtist;
            }
            return null;
        }

        @Override
        public boolean userCheck(String email, String password) {
            return false;
        }

    }


