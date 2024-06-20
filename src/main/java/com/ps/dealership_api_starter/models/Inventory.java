package com.ps.dealership_api_starter.models;

public class Inventory {
    private int inventoryId;
    private int dealershipId;
    private int vin;

    public Inventory() {
    }

    public Inventory(int inventoryId, int dealershipId, int vin) {
        this.inventoryId = inventoryId;
        this.dealershipId = dealershipId;
        this.vin = vin;
    }

    public int getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }

    public int getDealershipId() {
        return dealershipId;
    }

    public void setDealershipId(int dealershipId) {
        this.dealershipId = dealershipId;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }
}
