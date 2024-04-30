package com.aero.bookstore;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * Student Number : 301272363
 * Name : Farouk Oladega
 * Course : COMP228
 * Section : 15
 * Username : Farouk Oladega
 * Date: 2023-11-20
 */
public class Book {
    public SimpleStringProperty title = new SimpleStringProperty();

    public SimpleStringProperty author = new SimpleStringProperty();
    public SimpleStringProperty genre = new SimpleStringProperty();

    public SimpleDoubleProperty price = new SimpleDoubleProperty();
    public SimpleDoubleProperty discount = new SimpleDoubleProperty();
    public SimpleDoubleProperty finalPrice = new SimpleDoubleProperty();

    // modify
    public void calculateFinalPrice(){
        if (price.get() >= 20){
            discount.set(10.0);
        }else{
            discount.set(5.0);
        }

        finalPrice.set(price.get() - ((discount.get() / 100) * price.get()));
    }

    public String getTitle() {
        return title.get();
    }

    public SimpleStringProperty titleProperty() {
        return title;
    }

    public void setTitle(String title) {
        this.title.set(title);
    }

    public String getAuthor() {
        return author.get();
    }

    public SimpleStringProperty authorProperty() {
        return author;
    }

    public void setAuthor(String author) {
        this.author.set(author);
    }

    public String getGenre() {
        return genre.get();
    }

    public SimpleStringProperty genreProperty() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre.set(genre);
    }

    public double getPrice() {
        return price.get();
    }

    public SimpleDoubleProperty priceProperty() {
        return price;
    }

    public void setPrice(double price) {
        this.price.set(price);
    }

    public double getDiscount() {
        return discount.get();
    }

    public SimpleDoubleProperty discountProperty() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount.set(discount);
    }

    public double getFinalPrice() {
        return finalPrice.get();
    }

    public SimpleDoubleProperty finalPriceProperty() {
        return finalPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice.set(finalPrice);
    }
}
