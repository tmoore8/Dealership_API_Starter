package com.ps.dealership_api_starter.data;



import com.ps.dealership_api_starter.models.Vehicle;

import java.util.List;

public interface VehicleDao {
    List<Vehicle> searchByMinPrice(double price);
    List<Vehicle> searchByMaxPrice(double price);
    List<Vehicle> searchByMake(String make);
    List<Vehicle> searchByModel(String model);
    List<Vehicle> searchByMinYear(int year);
    List<Vehicle> searchByMaxYear(int year);
    List<Vehicle> searchByColor(String color);
    List<Vehicle> searchByMinMiles(int odometer);
    List<Vehicle> searchByMaxMiles(int odometer);
    List<Vehicle> searchByType(String vehicleType);
    Vehicle getByVin(int vin);
    Vehicle create(Vehicle vehicle);
    void update(int vin, Vehicle vehicle);
    void delete(int vin);
}
