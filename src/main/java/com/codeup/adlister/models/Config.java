package com.codeup.adlister.models;

public class Config {
        public String getUrl() {
            return "jdbc:mysql://localhost/movies_db?serverTimezone=UTC&useSSL=false";
        }
        public String getUser() {
            return "someuser";
        }
        public String getPassword() {
            return "strongpassword";
        }
    }
