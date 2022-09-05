package utils;

import bean.Book;

import java.util.Scanner;

public class BookStoreHelper {
    public static Book[] listBookSamePublisher(Book[] books, String publisher){
        Book[] result = new Book[books.length];
        int index = 0;
        for(int i = 0; i < books.length; i++){
            if(books[i].getPublisher().equalsIgnoreCase(publisher)){
                result[index] = books[i];
                index++;
            }
        }
        return  result;
    }

    public static Book[] listBookHaveLessThanPrice(Book[] books, double price){
        Book[] result = new Book[books.length];
        int index = 0;
        for(int i = 0; i < books.length; i++){
            if(books[i].getPrice() < price){
                result[index] = books[i];
                index++;
            }
        }
        return  result;
    }
}
