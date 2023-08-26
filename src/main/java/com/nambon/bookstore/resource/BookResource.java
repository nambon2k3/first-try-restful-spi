package com.nambon.bookstore.resource;

import com.nambon.bookstore.model.Book;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;


@Path("/books")
public class BookResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getAllBooks() {
        List<Book> data = new ArrayList<>();
        data.add(new Book("None", "None", "None"));
        data.add(new Book("Huyen", "Huyen", "Huyen"));
        return data;
    }
}
