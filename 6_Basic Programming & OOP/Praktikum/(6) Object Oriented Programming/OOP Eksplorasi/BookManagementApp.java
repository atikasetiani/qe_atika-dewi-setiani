/*
 * SECTION 6 - BASIC PROGRAMMING & OOP
 * Object Oriented Programming
 * Praktikum Soal Eksplorasi
 * Class BookManagenentApp
 */
package book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.UUID;

public class BookManagementApp extends Book{
    private static ArrayList<Book> bookList = new ArrayList<Book>();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int menuOption = 0;
        
        while (menuOption != 5) {
            printMenu();
            menuOption = scanner.nextInt();
            scanner.nextLine(); // consume newline character
            
            switch (menuOption) {
                case 1:
                    createBook();
                    break;
                case 2:
                    getAllBooks();
                    break;
                case 3:
                    getBooksId();
                    break;
                case 4:
                    getdeleteBook();
                    break;
                case 5:
                    System.out.println("Bye...");
                    break;
                default:
                    System.out.println("Invalid menu option");
                    break;
            }
        }
    }
    
    private static void printMenu() {
        System.out.println("   ");
        System.out.println("==============================");
        System.out.println("Welcome to book management app");
        System.out.println("Please choose your menu:");
        System.out.println("1. Create a new book");
        System.out.println("2. Get all books");
        System.out.println("3. Get book by ID");
        System.out.println("4. Delete book");
        System.out.println("5. Exit");
        System.out.println("==============================");
        System.out.println("   ");
    }
    
    private static void createBook() {
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        
        System.out.print("Enter author: ");
        String author = scanner.nextLine();
        
        System.out.print("Enter category: ");
        String category = scanner.nextLine();
        
        Book book = new Book(title, author, category);
        bookList.add(book);
        
        System.out.println("Book created!");
        System.out.println("===");
        System.out.println("ID: " + book.getId());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Category: " + book.getCategory());
        System.out.println("===");
    }
    
    private static void getAllBooks() {
        System.out.println("===ALL BOOKS===");
        
        for (Book book : bookList) {
            System.out.println("===");
            System.out.println("ID: " + book.getId());
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Category: " + book.getCategory());
            System.out.println("===");
        }
    }

    private static void getBooksId() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter book ID: ");
        UUID id = UUID.fromString(scanner.nextLine());
        boolean bookFound = false;
        for (Book book : bookList) {
            if (book.getId().equals(id)) {
                bookFound = true;
                System.out.println("===");
                System.out.println("ID: " + book.getId());
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Category: " + book.getCategory());
                System.out.println("===");
                break;
            }
        }
        if (!bookFound) {
            System.out.println("Book not found.");
        }
    }

    private static void getdeleteBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter book ID: ");
        UUID id = UUID.fromString(scanner.nextLine());
        for (Book book : bookList) {
            if (book.getId().equals(id)) {
                boolean bookFound = true;
                bookList.remove(book);
                break;
            }
        }
        System.out.println("Book Delete!");
    }     

    public BookManagementApp(String title, String author, String category) {
        super(title, author, category);
    }
    
}