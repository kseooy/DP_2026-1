package practice.ch01;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        //책 테스트
        Book book = new Book("Java Programming");
        System.out.println("Book name: " + book.getName());

        //책장 테스트
        BookShelf bookShelf = new BookShelf(5);
        bookShelf.appendBook(new Book("Java Programming"));
        bookShelf.appendBook(new Book("Python Programming"));
        bookShelf.appendBook(new Book("C++ Programming"));

        //책장에 있는 책 출력 

        // 방법1: 책꽂이에 클라이언트가 직접 접근해서 책을 꺼내는 방식 
        System.out.println("Books in the bookshelf:");
        for (int i = 0; i < bookShelf.getLength(); i++){
            System.out.println("- " + bookShelf.getBookAt(i).getName());
        }

        // 방법2: 책꽂이에 반복자(iterator)를 만들어서 책을 꺼내는 방식 
        System.out.println("x: Books in the bookshelf (using iterator):");
        Iterator<Book> it = bookShelf.iterator(); // 책꽃이한테 iterator를 요청하는 메소드를 it가 받음
        while(it.hasNext()) {
            System.out.println("- " + it.next().getName());

        // 방법3: 책꽂이에 반복자(iterator)를 만들어서 책을 꺼내는 방식 (for-each문)
        // 형식: for (타입 변수 : 컬렉션) { ... }
        for (Book b : bookShelf) { // Iterable 인터페이스를 구현했기 때문에 for-each문을 사용할 수 있음
            System.out.println("- " + b.getName());

        }


    }
}