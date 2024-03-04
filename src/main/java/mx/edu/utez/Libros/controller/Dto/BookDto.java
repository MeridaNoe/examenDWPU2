package mx.edu.utez.Libros.controller.Dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.edu.utez.Libros.model.Book;

import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class BookDto {

    private Long id;

    private String nombre;
    private String autor;
    private Timestamp fechaPublicacion;

    public Book getBooks(){
        return new Book(
                getId(),
                getNombre(),
                getAutor(),
                getFechaPublicacion()
        );
    }
}
