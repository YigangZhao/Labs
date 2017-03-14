package com.example.smaug.lab3;

/**
 * Created by smaug on 2017/3/14.
 */

public class Item {
    public Item(String name, int ImageId) {
        this.ImageId = ImageId;
        this.Name = name;
    }

    public int getImageId() {
        return ImageId;
    }

    public String getName() {
        return Name;
    }

    private int ImageId;
    private String Name;
}
