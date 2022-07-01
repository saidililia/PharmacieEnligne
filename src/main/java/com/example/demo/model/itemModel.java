package com.example.demo.model;

import com.sun.istack.NotNull;
import lombok.Data;

@Data
public class itemModel {
    @NotNull
    private int productID;
    @NotNull
    private int quantity;
    @NotNull
    private int commandeID;

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCommandeID() {
        return commandeID;
    }

    public void setCommandeID(int commandeID) {
        this.commandeID = commandeID;
    }

    public itemModel() {
    }

    public itemModel(int productID, int quantity, int commandeID) {
        this.productID = productID;
        this.quantity = quantity;
        this.commandeID = commandeID;
    }
}
