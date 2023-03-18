package org.example;

public class Item extends GameObject {

    private boolean isVisible;

    public Item() {
        super();
        this.isVisible = false;
    }

    public Item(int x, int y) {
        super(x, y);
        this.isVisible = false;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean visible) {
        this.isVisible = visible;
    }
}
