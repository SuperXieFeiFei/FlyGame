package com.tarena.fly;

import java.util.Random;

public class Airplane extends FlyingObject implements Enemy{
    private int speed = 3;

    public Airplane(){
        this.image = ShootGame.airplane;
        width = image.getWidth();
        height = image.getHeight();
        y = -height;
        Random random = new Random();
        x = random.nextInt(ShootGame.WIDTH - width);
    }

    @Override
    public int getScore() {
        return 5;
    }

    @Override
    public boolean outOfBounds() {
        return y > ShootGame.HEIGHT;
    }

    @Override
    public void moveStep() {
        y = y + speed;
    }
}
