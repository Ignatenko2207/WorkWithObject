package com.mainacad.model;

public class Item {
    private String article;
    private String name;
    private Double price;

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Item() {
    }

    public Item(String article, String name, Double price) {
        this.article = article;
        this.name = name;
        this.price = price;
    }
}
