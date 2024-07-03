/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.book;



public class Book {
     String title;
     String author;
     int year;
     static String genre;
     static int totalBooks = 0;

    public Book(String title, String author, int year, String genre) {
        this.title = title;
        this.author = author;
        this.year = year;
        Book.genre = genre;
        totalBooks++;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Genre: " + genre);
    }

    public static void displayTotalBooks() {
        System.out.println("Total number of books: " + totalBooks);
    }

    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell", 1949, "Dystopian");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960, "Fiction");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, "Classic");

        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();

        Book.displayTotalBooks();
    }
}
