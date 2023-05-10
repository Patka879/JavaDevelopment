package org.example.advancedDevelopment.task8;

public class Basket<T> {

    private int numOfProducts;

    public void addToBasket(T product) throws BasketFullException {
        if (numOfProducts == 10) {
            throw new BasketFullException("Basket is full. Can't add products");
        } else {
            numOfProducts++;
        }
    };
    public void removeFromBasket(T product) throws BasketEmptyException {
        if (numOfProducts == 0) {
            throw new BasketEmptyException("Basket is empty. Can't remove products");
        } else {
            numOfProducts--;
        }
    };

}
