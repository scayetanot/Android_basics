package com.droidrank.sample;

/**
 * Created by sebastien on 11/29/17.
 */

public class Cart implements ICart{

    private static Cart instance = null;

    public Cart getInstance(){
        if(instance ==  null)
            Cart.instance = new Cart();

        return Cart.instance;
    }

    public void addItem(Cart cart){

    }
    public int getCount(){
        return 1;
    }
    public void removeItem(int id){

    }




}
