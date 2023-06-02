package com.university.carter.service;

import com.university.carter.model.signup;

public interface signupservice {
    public signup saveAccount(signup signup);
    public signup findAccount(Long id);
    public boolean userCheck(String email, String password );
}
