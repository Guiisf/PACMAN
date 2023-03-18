package org.example;

public class Player extends GameObject {
    private double direction;
    private int life;
    private boolean invincible;

    public Player() {
        super();
        this.direction = 0.0;
        this.life = 3;
        this.invincible = false;
    }

    public Player(int x, int y, double direction) {
        super(x, y);
        this.direction = validarDirecao(direction);
        this.life = 3;
        this.invincible = false;
    }

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        this.direction = validarDirecao(direction);
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        if (life < 0) {
            throw new IllegalArgumentException("Number of lives cannot be negative");
        }
        this.life = life;
    }

    public boolean isInvincible() {
        return invincible;
    }

    public void setInvincible(boolean invincible) {
        this.invincible = invincible;
    }

    public boolean podemAndar() {
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
        if (podemAndar()) {
            if (direction == 0) {
                y -= 10;
            } else if (direction == 90) {
                x += 10;
            } else if (direction == 180) {
                y += 10;
            } else if (direction == 270) {
                x -= 10;
            }
        }
    }

    private double validarDirecao(double direction) {
        if (direction == 0.0 || direction == 90.0 || direction == 180.0 || direction == 270.0) {
            return direction;
        }
        throw new IllegalArgumentException("Direção invalida");
    }

    public void perderVida(Player player) {
        player.setLife(player.getLife() - 1);
    }
}



