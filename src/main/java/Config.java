class Config {
    public String getUrl() {
        return "jdbc:mysql://localhost/employees?serverTimezone=UTC&useSSL=false";
    }
    public String getUsername() {
        return "codeup_test_user";
    }
    public String getPassword() {
        return "codeup";
    }
}