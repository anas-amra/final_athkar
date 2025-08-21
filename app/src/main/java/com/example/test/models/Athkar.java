package com.example.test.models;

public class Athkar {
    private int id ;

    private int image ;
    private String card_title ;

    private String key;

    public Athkar() {
    }
    public Athkar(int id , int image, String card_title , String key) {
        this.id = id;
        this.image = image;
        this.card_title = card_title;
        this.key =key;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getCard_title() {
        return card_title;
    }

    public void setCard_title(String card_title) {
        this.card_title = card_title;
    }

    public String getKey() {
        return key;
    }
}
