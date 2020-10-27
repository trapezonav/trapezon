package com.mycompany.app.classes;

public class Runner {
    public static void main(String[] args) {
        Book book1 = new Book(1,"One Flew Over the Cuckoo's Nest", Author.KESEY,Publisher.VIKING, 1962, 320, 10, "Hard");
        Book book2 = new Book(2,"Harry Potter and the Philosopher's Stone", Author.ROWLING,Publisher.BLOOMSBURY, 1997,223, 15, "Hard");

        Book[] booksArr = BookArrayCreator.arrBooks(book1,book2);

        SortingBooks.byAuthor(booksArr, Author.KESEY);
        SortingBooks.byPublisher(booksArr,Publisher.BLOOMSBURY);
        SortingBooks.byYear(booksArr,1950);
    }
}
