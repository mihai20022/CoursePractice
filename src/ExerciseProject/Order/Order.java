package ExerciseProject.Order;

import ExerciseProject.Products.Products;

import java.util.Arrays;

public class Order {
    private int id;
    private String name;
    private String customer;
    private Products[] productsList;
    private int[] qtylist;

    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Products[] getProductsList() {
        return productsList;
    }

    public void setProductsList(Products[] productsList) {
        this.productsList = productsList;
    }

    public int[] getQtylist() {
        return qtylist;
    }

    public void setQtylist(int[] qtylist) {
        this.qtylist = qtylist;
    }

    public Order(int id, String name, String customer, Products[] productsList, int[] qtylist) {
        this.id = id;
        this.name = name;
        this.customer = customer;
        this.productsList = productsList;
        this.qtylist = qtylist;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", customer='" + customer + '\'' +
                ", productsList=" + Arrays.toString(productsList) +
                ", qtylist=" + Arrays.toString(qtylist) +
                '}';
    }
}
