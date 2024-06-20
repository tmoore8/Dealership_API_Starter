package com.ps.dealership_api_starter.data;

import com.ps.dealership_api_starter.models.Dealership;

import java.util.List;

public interface DealershipDao
{
    List<Dealership> search(String name, String phone);
    Dealership getById(int dealershipId);
    Dealership create(Dealership dealership);
    void update(int dealershipId, Dealership dealership);
    void delete(int productId);
}
