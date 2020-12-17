package com.example.login;

public class Categories {
    private String nameCate;
    private String image;

    public Categories(){}
    public Categories(String nameCate, String image){
        this.nameCate=nameCate;
        this.image=image;
    }

    public String getNameCate(){
        return this.nameCate;
    }

    public void setName(String nameCate) {
        this.nameCate = nameCate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
