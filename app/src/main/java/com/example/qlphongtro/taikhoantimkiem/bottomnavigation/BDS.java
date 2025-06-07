package com.example.qlphongtro.taikhoantimkiem.bottomnavigation;
public class BDS {
    private String imageUrl;
    private String title;
    private String price;
    private String area;
    private String location;
    private String name;
    private String phone;

    public BDS(String imageUrl, String title, String price, String area, String location, String name, String phone) {
        this.imageUrl = imageUrl;
        this.title = title;
        this.price = price;
        this.area = area;
        this.location = location;
        this.name = name;
        this.phone = phone;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

