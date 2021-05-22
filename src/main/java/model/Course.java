package model;

import java.io.Serializable;

public class Course implements Serializable {
    private int id;
    private String name;
    private String type;
    private int price;
    private String img;

    public Course(){}
    public Course(int id, String name, String type, int price,String img) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}

