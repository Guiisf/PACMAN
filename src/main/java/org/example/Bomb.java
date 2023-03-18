package org.example;

public class Bomb extends Item {

    public Bomb(int x, int y) {
        super(x, y);
    }

    public boolean canExplode(Player player) {
        return player.getX() == getX() && player.getY() == getY();
    }

    public void explode(Player player) {
        if (canExplode(player)) {
            player.perderVida(player);
        }
    }
    }


