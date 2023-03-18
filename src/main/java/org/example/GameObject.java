package org.example;

public class GameObject {
    public int x;
    public int y;
    public int screenSize;

    public GameObject() {
        this.x = 0;
        this.y = 0;
        this.screenSize = 0;
    }

    public GameObject(int x, int y) {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("Invalid position");
        }
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = validatePosition(x);
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = validatePosition(y);
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        if (screenSize < 0) {
            throw new IllegalArgumentException("Screen size cannot be negative");
        }
        this.screenSize = screenSize;
    }

    private int validatePosition(int position) {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("Invalid position");
        }

        return position;
    }
}
