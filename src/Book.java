import enums.Category;

import java.util.List;

public class Book {
    private static Integer id = 0;
    private String title;
    private String author;
    private Category category;
    private boolean isAvailable;

    public Book(String title, String author, Category category, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.isAvailable = isAvailable;
    }

    public Book() {
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}