package com.nambon.bookstore.config;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.Path;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/api")
public class BookApplication extends ResourceConfig {
    public BookApplication() {
        packages("com.nambon.bookstore.resource");
    }
}
