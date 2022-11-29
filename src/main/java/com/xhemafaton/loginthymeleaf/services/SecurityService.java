package com.xhemafaton.loginthymeleaf.services;

public interface SecurityService {
    boolean isAuthenticated();
    void autoLogin(String username,String password);
}
