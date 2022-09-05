package view;

import bean.Book;
import bean.BookRef;
import bean.BookStudy;
import utils.BookStoreHelper;

public class Ex05_BookStore {
    public static void main(String[] args) {
        Book[] listBooksInStore = {
                new BookStudy("001", 200, "Nhi Dong", "New"),
                new BookStudy("002", 40, "Hanh Phuc", "New"),
                new BookStudy("003", 120, "Nhi Dong", "Old"),
                new BookRef("004", 10, "Tuoi tre", 34),
                new BookRef("005", 25000, "Nhi Dong", 14)
        };

        // Get books have same publisher "Nhi Dong"
        for(Book x : BookStoreHelper.listBookSamePublisher(listBooksInStore, "Nhi Dong")){
            if(x instanceof BookStudy){
                System.out.println(((BookStudy)x).getId());
            } else if(x instanceof BookRef){
                System.out.println(((BookRef)x).getId());
            }
        }

        System.out.println("===========================================");
        // Get books have price < 50
        for(Book x : BookStoreHelper.listBookHaveLessThanPrice(listBooksInStore, 50)){
            if(x instanceof BookStudy){
                System.out.println(((BookStudy)x).getId());
            } else if(x instanceof BookRef){
                System.out.println(((BookRef)x).getId());
            }
        }

        // Get study books have price 100..200

    }


}
