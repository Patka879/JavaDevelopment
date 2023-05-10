package org.example.advancedDevelopment.task8;

import java.util.List;

public class Basket<T> {

    private List<T> items;

    public Basket(List<T> items) {
        this.items = items;
    }

    public void addToBasket(T product) throws BasketFullException {
        if (items.size() == 10) {
            throw new BasketFullException("Basket is full. Can't add products");
        } else {
            items.add(product);
        }
    }
    public void removeFromBasket(T product) throws BasketEmptyException {
        if (items.isEmpty()) {
            throw new BasketEmptyException("Basket is empty. Can't remove products");
        } else {
            items.remove(product);
        }
    };

}
