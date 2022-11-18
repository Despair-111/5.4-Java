package com.company;

public class Main {

    public static void main(String[] args) {
        Reader reader1 = new Reader("Pavel","Kokarev","Ig.");
        Book book1 = new Book("Gogol","Shanel");


        reader1.takeBook(5);
        reader1.takeBook(2,"Groza","Kolobok");
        reader1.takeBook(3,"Gore ot yma","Kapitanskaya dochka","Taras Bylba");
        System.out.println();
        reader1.takeBook(1,book1);
        System.out.println();
        reader1.returnBook(6);
        reader1.returnBook(2,"Groza","Taras Bylba");
        reader1.returnBook(2,"1488","fboba");





    }

    }

