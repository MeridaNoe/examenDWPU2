package mx.edu.utez.Libros.service;

import mx.edu.utez.Libros.model.Book;
import mx.edu.utez.Libros.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;

    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    public List<Book> getBookByNombre(String nombre){
        return repository.findBookByNombre(nombre);
    }
    public List<Book> getBookByAuthor(String autor) {
        return repository.findBookByAutor(autor);
    }

    public Book buscarByFechaPublicacion(Date fechaPublicacion){
        return repository.findBookByFechaPublicacion(fechaPublicacion);
    }

    public Book insertBook(Book book) {
        return repository.save(book);
    }

    public void deletePeli(Long id) {
        repository.deleteById(id);
    }

    public Book updateBook(Book book) {
        return repository.saveAndFlush(book);
    }


}
