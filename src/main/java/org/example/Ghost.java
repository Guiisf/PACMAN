package org.example;

import java.util.Random;

public class Ghost extends GameObject {
    private int direction;
    private int speed;

    public Ghost() {
        super();
        this.direction = 0;
        this.speed = 5;
    }

    public Ghost(int x, int y, int direction) {
        super(x, y);
        this.direction = direction;
        this.speed = 5;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean podemAndar(int newDirection) {
        int proximoMovimentoX = x;
        int proximoMovimentoY = y;
        if (direction == 0) {
            proximoMovimentoY -= 10;
        } else if (direction == 90) {
            proximoMovimentoX += 10;
        } else if (direction == 180) {
            proximoMovimentoY += 10;
        } else if (direction == 270) {
            proximoMovimentoX -= 10;
        } else {
            return false;
        }
        return proximoMovimentoX >= 0 && proximoMovimentoX <= screenSize && proximoMovimentoY >= 0 && proximoMovimentoY <= screenSize;
    }



    public void move() {
        int[] directions = {0, 90, 180, 270};
        int newDirection = directions[new Random().nextInt(directions.length)];

        // Verifica se o Ghost pode se mover na nova direção escolhida aleatoriamente
        if (podemAndar(newDirection)) {
            direction = newDirection;
            if (direction == 0) {
                y -= speed;
            } else if (direction == 90) {
                x += speed;
            } else if (direction == 180) {
                y += speed;
            } else if (direction == 270) {
                x -= speed;
            }
        }
    }

}
