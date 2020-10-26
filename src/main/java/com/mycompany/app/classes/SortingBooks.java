package com.mycompany.app.classes;

public class SortingBooks {
    public static void byAuthor(Book[] books, Author author){
        System.out.println("List of books by " + author.getFullName() + ":");
        for (Book book:books) {
            if (book.getAuthor().equals(author)){
                System.out.println(book);
            }
        }
    }
    public static void byPublisher(Book[] books, Publisher publisher){
        System.out.println("List of books by " + publisher.getName() + ":" );
        for (Book book:books) {
            if (book.getPublisher().equals(publisher)){
                System.out.println(book);
            }
        }
    }

    public static void byYear(Book[] books, int year){
        System.out.println("List of books released after " + year +":");
        for (Book book:books) {
            if (book.getYearOfPublishing()>year){
                System.out.println(book);
            }
        }
    }
}
