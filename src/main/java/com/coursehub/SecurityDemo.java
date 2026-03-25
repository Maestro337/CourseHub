package com.coursehub;

import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Random;
import io.jsonwebtoken.Jwts;

// Demo file - security issues for demonstration purposes

public class SecurityDemo {

    // Hardcoded credentials
    private static final String DB_PASSWORD = "admin1234";
    private static final String API_KEY = "api_key = \"prod-secret-key-abc123\"";

    // AWS credentials in code
    private static final String AWS_KEY = "AKIAIOSFODNN7EXAMPLE";

    // Credentials in URL
    private String dbUrl = "jdbc:postgresql://admin:password123@prod-db.example.com:5432/coursehub";

    // SQL Injection vulnerability
    public void getUser(Connection conn, String userId) throws Exception {
        String query = "SELECT * FROM users WHERE id = " + userId;
        conn.createStatement().execute(query);
    }

    // SQL Injection via string concat
    public void getCourse(Connection conn, String title) throws Exception {
        String query = "SELECT * FROM courses WHERE title = '" + title + "'";
        conn.createStatement().execute(query);
    }

    // Weak hash algorithm
    public byte[] hashPassword(String password) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        return md.digest(password.getBytes());
    }

    // Insecure random for token generation
    public String generateToken() {
        Random random = new Random();
        return String.valueOf(random.nextInt(999999));
    }

    // JWT without signature verification
    public void parseToken(String token) {
        Jwts.parser().parseClaimsJwt(token);
    }

    // JWT with null signing key
    public void verifyToken(String token) {
        Jwts.builder().setSigningKey(null).compact();
    }
}
