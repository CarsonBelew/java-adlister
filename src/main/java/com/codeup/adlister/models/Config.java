package com.codeup.adlister.models;

public class Config {
        public String getUrl() {
            return "jdbc:mysql://localhost/adlister_db?serverTimezone=UTC&useSSL=false";
        }
        public String getUser() {
            return "codeup_test_user";
        }
        public String getPassword() {
            return "codeup";
        }
    }
