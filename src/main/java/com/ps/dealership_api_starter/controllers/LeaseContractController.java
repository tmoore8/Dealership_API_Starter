package com.ps.dealership_api_starter.controllers;

import com.ps.dealership_api_starter.data.LeaseContractDao;
import com.ps.dealership_api_starter.models.LeaseContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("leasecontracts")
@CrossOrigin
public class LeaseContractController
{
    private LeaseContractDao leaseContractDao;

    @Autowired
    public LeaseContractController(LeaseContractDao leaseContractDao){ this.leaseContractDao = leaseContractDao;}

    @GetMapping("{id}")
    public LeaseContract getById(@PathVariable int contractId)
    {
        try
        {
            var product = leaseContractDao.getById(contractId);

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
    public LeaseContract addLeaseContract(@RequestBody LeaseContract leaseContract)
    {
        try
        {
            return leaseContractDao.create(leaseContract);
        }
        catch(Exception ex)
        {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Oops... our bad.");
        }
    }
}
