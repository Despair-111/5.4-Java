package com.company;

public class Reader {
    private String name;
    private String surname;
    private String secondName;
    private String numberLibraryTicket;
    private String faculty;
    private String dateOfBirth;
    private String phoneNumber;
    private Book book = new Book("Gogol","Shanel");

    public void takeBook(int numberTakenBooks) {
        System.out.println("Student " + surname + " " + name + " " + secondName + "take" + numberTakenBooks + " books");
    }

    public void takeBook(int numberBookNames, String ... books) {
        System.out.println("Student " + surname + " " + name + " " + secondName + "takes:");
        for (int i = 0; i < numberBookNames; i++)
            System.out.println(books[i]);
    }
    public void takeBook(int numberBookNames, Book ... books) {
        System.out.println("Student " + surname + " " + name + " " + secondName + "takes:");
        for (int i = 0; i < numberBookNames; i++) {
            book = books[i];
            book.outputBook();
        }
    }
    public void returnBook(int numberTakenBooks) {
        System.out.println("Student" + surname + " " + name + " " + secondName + "return " + numberTakenBooks + " books");
    }

    public void returnBook(int numberBookNames, String ... books) {
        System.out.println("Student" + surname + " " + name + " " + secondName + "returns:");
        for (int i = 0; i < numberBookNames; i++)
            System.out.println(books[i]);
    }

    public void returnBook(int numberBookNames, Book ... books) {
        System.out.println("Student " + surname + " " + name + " " + secondName + " returns:");
        for (int i = 0; i < numberBookNames; i++) {
            book = books[i];
            book.outputBook();
        }
    }

    public Reader(String name, String surname, String secondName) {
        this.name = name;
        this.surname = surname;
        this.secondName = secondName;
    }
}



