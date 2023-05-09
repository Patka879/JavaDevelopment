package org.example.advancedDevelopment.task4;

import java.util.ArrayList;
import java.util.List;

public class Magazine {

    private List<String> bullets = new ArrayList<>();
    private int size;

    public Magazine(int size) {
        this.size = size;
    }

    public void loadBullet(String bullet) {
        if (bullets.size() < size) {
            bullets.add(bullet);
        } else {
            System.out.println("Magazine is full");
        }
    }

    public void isLoaded() {
        if(!bullets.isEmpty()) {
            System.out.println("Magazine is loaded");
        } else {
            System.out.println("Magazine is not loaded");
        }
    }

    public void shot() {
        String bulletInUse = bullets.get(bullets.size() - 1);
        if (bullets.isEmpty()) {
            System.out.println("EMPTY MAGAZINE");
        } else {
            System.out.println("Bullet " + bulletInUse + " was fired");
            bullets.remove(bulletInUse);
        }
    }
}
