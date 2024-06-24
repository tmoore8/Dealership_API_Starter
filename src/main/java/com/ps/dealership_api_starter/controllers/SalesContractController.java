package com.ps.dealership_api_starter.controllers;

import com.ps.dealership_api_starter.data.SalesContractDao;
import com.ps.dealership_api_starter.models.SalesContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("salescontracts")
@CrossOrigin
public class SalesContractController
{
    private SalesContractDao salesContractDao;

    @Autowired
    public SalesContractController(SalesContractDao salesContractDao){ this.salesContractDao = salesContractDao;}

    @GetMapping("{id}")
    public SalesContract getById(@PathVariable int contractId)
    {
        try
        {
            var product = salesContractDao.getById(contractId);

            if(product == null){
                throw new ResponseStatusException(HttpStatus.NOT_FOUND);
            }

            return product;
        }
        catch(Exception ex)
        {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Oops... our bad.");
        }
    }
    @PostMapping()
    public SalesContract addSalesContract(@RequestBody SalesContract salesContract)
    {
        try
        {
            return salesContractDao.create(salesContract);
        }
        catch(Exception ex)
        {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Oops... our bad.");
        }
    }
}
