package hw.ch01;

public class Book {
    private String name;

    // ⭐ Step1: 필드 추가
    private String genre;
    private int year;
    private double price;

    // ⭐ Step1: 기존 생성자 유지
    public Book(String name) {
        this.name = name;
        this.genre = "";
        this.year = 0;
        this.price = 0.0;
    }

    // ⭐ Step1: 오버로딩 생성자 추가
    public Book(String name, String genre, int year, double price) {
        this.name = name;
        this.genre = genre;
        this.year = year;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    // ⭐ Step1: getter 추가
    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }
}