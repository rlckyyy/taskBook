import exception.BookIsNotAvailableException;
import exception.BookIsNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> bookList;
    {
        bookList = new ArrayList<>();
    }

    public void addBook(Book book){
        bookList.add(book);
    }

    public List<Book> getAll(){
        return bookList;
    }

    public void deleteBook(Integer id){
        bookList.removeIf(book -> book.getId().equals(id));
    }


    public Book getBookById(Integer id){
        Book book = bookList.get(id);
        if (book==null){
            throw new BookIsNotFoundException("Book with id " + id + ", is not found");
        }
        if (!book.isAvailable()){
            throw new BookIsNotAvailableException("Book is Not Available Exception");
        }
        return bookList.get(id);
    }
}
