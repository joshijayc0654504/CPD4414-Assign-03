/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c0654504
 */
public class Product {
    private int product_id;
    private String name;
    private String description;
    private int quantity;

    public Product(int product_id, String name, String description, int quantity) {
        this.product_id = product_id;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
    }
    
    public int getProductId() {
        return product_id;
    }

    public void setProductId(int product_id) {
        this.product_id = product_id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
            
}
