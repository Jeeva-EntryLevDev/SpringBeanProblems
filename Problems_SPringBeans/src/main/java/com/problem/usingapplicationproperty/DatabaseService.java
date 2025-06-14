package com.problem.usingapplicationproperty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatabaseService {

    private final DatabaseConfig config;

    @Autowired
    public DatabaseService(DatabaseConfig config) {
        this.config = config;
    }

    public void connect() {
        config.startConnection();
    }
}
