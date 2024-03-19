import java.util.Scanner;

import static enums.Category.*;

public class Main {
    public static void main(String[] args) {
        //TODO поиск по категориям, можешщь потом добавить год выпуск книги и сделать поиск по годам
        // Реализуй логику читания книги: Когда читаешь книгу то ты должна поставить книге available false
        // Должна написать метод для сдачи книги
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("""
                    1. List all books
                    2. Add Book
                    3. Delete Book
                    4. GetBook By ID
                    """);
            int choice = scanner.nextInt();
            if (choice==1){
                library.getAll().forEach(System.out::println);
            } else if (choice == 2) {
                Book book = new Book();
                System.out.println("Enter Title");
                String title = scanner.nextLine();
                book.setTitle(title);
                System.out.println("Enter Author");
                String author = scanner.nextLine();
                book.setAuthor(author);
                System.out.println("""
                        Choose category for book
                        1. Sport
                        2. IT
                        3. Romantic
                        4. Fantasy
                        5. Literature
                        """);
                int categoryChoice = scanner.nextInt();
                if (categoryChoice==1){
                    book.setCategory(SPORT);
                } else if (categoryChoice == 2) {
                    book.setCategory(IT);
                } else if (categoryChoice == 3) {
                    book.setCategory(ROMANTIC);
                }
                book.setAvailable(false);
                library.addBook(book);
            } else if (choice == 3) {
                //TODO delete
            } else if (choice == 4) {
                // TODO getBookByID
            }
        }
    }
}