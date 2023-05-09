package org.example.advancedDevelopment.task4;

/**
 * Create a class simulating a magazine for a firearm. The class should have the ability to define the size of the
 * magazine using a constructor. Implement the following methods:
 * loadBullet(String bullet) → adds a bullet to the magazine, doesn't allow loading more bullets than the
 * magazine capacity
 * isLoaded() → returns information whether the firearm is loaded (at least one bullet) or not
 * shot() → one invocation fires (prints in the console) one - the last loaded bullet and prepares the next one, loaded before the last one. If there are no more bullets, it prints "empty magazine" in the console.
 */
public class MagazineDemo {
    public static void main(String[] args) {
        Magazine magazine = new Magazine(4);

        magazine.isLoaded();
        magazine.loadBullet("bullet1");
        magazine.isLoaded();
        magazine.loadBullet("bullet2");
        magazine.loadBullet("bullet3");
        magazine.loadBullet("bullet4");
        magazine.loadBullet("bullet5");
        magazine.shot();
    }
}
