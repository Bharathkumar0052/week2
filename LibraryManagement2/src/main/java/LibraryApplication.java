package com.example.library;

public class BookService {

    private BookRepository bookRepository;

    // Setter method for dependency injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Other methods that use bookRepository
    public void performSomeAction() {
        // Example usage of bookRepository
        bookRepository.save(new Book());
    }
}
