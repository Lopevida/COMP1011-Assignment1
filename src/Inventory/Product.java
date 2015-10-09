/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory;

/**
 *
 * @author chaod
 */
public class Product {
    private double productPrice;
    private String productId,productName,manufacturer,description,category;
  
    public Product(){
        
    }
        public Product(String productId, String productName,String category, String manufacturer,String description,double productPrice){
        this.productName = productName;
        this.productId = productId;
        this.productPrice = productPrice;
        this.description = description;
        this.category = category ;
        this.manufacturer = manufacturer;
    }
        
            @Override
    public String toString() 
    {
        String productInfo = "";

        productInfo += "\nName:\t\t" + getProductName();
        productInfo += "\nId:\t\t" + getProductId();
        productInfo += "\nCategory:\t" + getCategory();
        productInfo += "\nManufacturer:\t" + getManufacturer();
        productInfo += "\nDescription:\t" + getDescription();
        productInfo += "\nPrice:\t\t$" + getProductPrice();
 
        return productInfo;
    }
    //mutator
    public void setProductId(String productId)
    {
         this.productId = productId;
    }
    public void setProductName(String productName)
    {
        this.productName = productName;
    }
    public void setCategory(String category)
    {
         this.category = category;
    }
    public void setManufaturer(String manufacturer)
    {
        this.manufacturer = manufacturer;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }

    public void setProductPrice(double productPrice)
    {
        //add validation here before setting the value
        this.productPrice = productPrice;
        //run changeActivationState if needed
    }
    //accessor
    public String getProductId()
    {
        return this.productId;
    }
    public String getProductName()
    {
        return this.productName;
    }
    public String getCategory()
    {
        return this.category;
    }
    public String getManufacturer()
    {
        return this.manufacturer;
    }
    public String getDescription()
    {
        return this.description;
    }
      public double getProductPrice()
    {
        return this.productPrice;
    }
}
