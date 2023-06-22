package org.example.lesson3.HomeWork.exes3;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Война и мир", "Толстой", 1100.00, 1995, 1300);
        Book book2 = new Book("Гарри Поттер и узник Азкабана", "Роулинг", 786.00, 2019, 544);
        Book book3 = new Book("Зеленая миля", "Кинг", 525.00, 2014, 384);
        Book book4 = new Book("Унесенные ветром", "Митчел", 618.00, 2020, 1088);
        Book book5 = new Book("Свита короля", "Сакавич", 550.00, 2021, 521);
        Book book6 = new Book("Граф Монте-Кристо", "Дюма", 1500.00, 2017, 1243);
        Book book7 = new Book("Буря мечей", "Мартин", 600.00, 2008, 951);
        Book book8 = new Book("Пустая могила", "Страуд", 799.99, 2018, 487);
        Book book9 = new Book("Десять негретят", "Кристи", 1450.00, 2021, 288);
        Book book10 = new Book("Мастер и Маргарита", "Булгаков", 899.00, 2006, 481);

        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.add(book7);
        books.add(book8);
        books.add(book9);
        books.add(book10);
        searhbook(books);
    }

    private static void searhbook(ArrayList<Book> books) {
        String selectionBook = "";
        for(Book book: books){
            if (proverkapages(book.getPages()) && book.getSurname().toLowerCase().contains("а") && book.getYear() > 2009){
                selectionBook += book.getTitle() + "\n";
            }
        }
        System.out.printf("Список книг соответствующий критериям:%n%s", selectionBook);
    }

    private static boolean proverkapages(Integer pages) {
        int var = 2;
        for (int i = 0; i < pages; i++) {
            if (pages > 1){
                if(pages % var != 0){
                    var++;
                }else if (pages == var){
                    return true;
                }else return false;
            }
        }
        return false;
    }
}
