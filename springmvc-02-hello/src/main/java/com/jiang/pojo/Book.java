package com.jiang.pojo;

/**
 * @Title:
 * @author: JiangPeng
 */
public class Book {
    private String bookName;
    private String author;
    private double price;
    private Integer stock;
    private Integer sales;
    public Book(){

    }
    public Book(String nameBook, String author, double price, Integer stock, Integer sales) {
        this.bookName = nameBook;
        this.author = author;
        this.price = price;
        this.stock = stock;
        this.sales = sales;
    }

    public String getNameBook() {
        return bookName;
    }

    public void setNameBook(String nameBook) {
        this.bookName = nameBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", sales=" + sales +
                '}';
    }
}
