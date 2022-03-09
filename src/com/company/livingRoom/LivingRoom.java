package com.company.livingRoom;

public class LivingRoom {
    public static void main(String[] args) {
        Book orwell1984 = new Book("George Orwell", "1984", 320);
        Book annaKarenina = new Book("Leo Tolstoy", "Anna Karenina", 1300);

        BookCase bookcase = new BookCase(8, "Classics", new  Book[]{orwell1984, annaKarenina});

        bookcase.store();
        
    }
}

