/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Basia
 */
public class Product {
    
    public int id;
    public String name;
    public double price;
    public String category;

    public Product(int id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category=category;
    }
    
    public String getProduct() {
        return name;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
