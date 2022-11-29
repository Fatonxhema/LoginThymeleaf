package com.xhemafaton.loginthymeleaf.services;

import com.xhemafaton.loginthymeleaf.model.User;

public interface UserService {
    void save(User user);
    User findByUsername(String username);
}
