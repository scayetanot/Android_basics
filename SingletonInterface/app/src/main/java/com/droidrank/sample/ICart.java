package com.droidrank.sample;

/**
 * Created by sebastien on 11/29/17.
 */

public interface ICart {
    void addItem(Cart cart);
    int getCount();
    void removeItem(int id);
}