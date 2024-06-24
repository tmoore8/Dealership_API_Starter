package com.ps.dealership_api_starter.controllers;


import com.ps.dealership_api_starter.data.VehicleDao;
import com.ps.dealership_api_starter.models.Dealership;
import com.ps.dealership_api_starter.models.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("vehicles")
@CrossOrigin
public class VehicleController
{
    private VehicleDao vehicleDao;
    @Autowired
    public VehicleController(VehicleDao vehicleDao){ this.vehicleDao = vehicleDao;}

    @GetMapping("/minprice")
    public List<Vehicle> searchByMinPrice(@RequestParam(required = false) double price
    )
    {
        try
        {
         return vehicleDao.searchByMinPrice(price);
        }
        catch (Exception ex)
        {
            throw  new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Oops... our bad.");
        }
    }
    @GetMapping("/maxprice")
    public List<Vehicle> searchByMaxPrice(@RequestParam(required = false) double price
    )
    {
        try
        {
            return vehicleDao.searchByMaxPrice(price);
        }
        catch (Exception ex)
        {
            throw  new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Oops... our bad.");
        }
    }
    @GetMapping("/make")
    public List<Vehicle> searchByMake(@RequestParam(required = false) String make
    )
    {
        try
        {
            return vehicleDao.searchByMake(make);
        }
        catch (Exception ex)
        {
            throw  new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Oops... our bad.");
        }
    }
    @GetMapping("/model")
    public List<Vehicle> searchByModel(@RequestParam(required = false) String model
    )
    {
        try
        {
            return vehicleDao.searchByModel(model);
        }
        catch (Exception ex)
        {
            throw  new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Oops... our bad.");
        }
    }
    @GetMapping("/minyear")
    public List<Vehicle> searchByMinYear(@RequestParam(required = false) int year
    )
    {
        try
        {
            return vehicleDao.searchByMinYear(year);
        }
        catch (Exception ex)
        {
            throw  new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Oops... our bad.");
        }
    }
    @GetMapping("/maxyear")
    public List<Vehicle> searchByMaxYear(@RequestParam(required = false) int year
    )
    {
        try
        {
            return vehicleDao.searchByMaxYear(year);
        }
        catch (Exception ex)
        {
            throw  new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Oops... our bad.");
        }
    }
    @GetMapping("/color")
    public List<Vehicle> searchByColor(@RequestParam(required = false) String color
    )
    {
        try
        {
            return vehicleDao.searchByColor(color);
        }
        catch (Exception ex)
        {
            throw  new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Oops... our bad.");
        }
    }

    @GetMapping("/minmiles")
    public List<Vehicle> searchByMinMiles(@RequestParam(required = false) int odometer
    )
    {
        try
        {
            return vehicleDao.searchByMinMiles(odometer);
        }
        catch (Exception ex)
        {
            throw  new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Oops... our bad.");
        }
    }

    @GetMapping("/maxmiles")
    public List<Vehicle> searchByMinPrice(@RequestParam(required = false) int odometer
    )
    {
        try
        {
            return vehicleDao.searchByMaxMiles(odometer);
        }
        catch (Exception ex)
        {
            throw  new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Oops... our bad.");
        }
    }

    @GetMapping("/type")
    public List<Vehicle> searchByType(@RequestParam(required = false) String type
    )
    {
        try
        {
            return vehicleDao.searchByType(type);
        }
        catch (Exception ex)
        {
            throw  new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Oops... our bad.");
        }
    }
    @GetMapping("{vin}")
    public Vehicle getByVin(@PathVariable int vin)
    {
        try
        {
            var product = vehicleDao.getByVin(vin);

            if (product == null){
                throw new ResponseStatusException(HttpStatus.NOT_FOUND);
            }
            return product;
        }
        catch (Exception ex)
        {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Oops... our bad.");
        }
    }
    @PostMapping()
    public Vehicle addVehicle(@RequestBody Vehicle vehicle)
    {
        try
        {
            return vehicleDao.create(vehicle);
        }
        catch(Exception ex)
        {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Oops... our bad.");
        }
    }
    @PutMapping("{vin}")
    public void updateVehicle(@PathVariable int vin, @RequestBody Vehicle vehicle)
    {
        try
        {
            vehicleDao.update(vin, vehicle);
        }
        catch(Exception ex)
        {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Oops... our bad.");
        }
    }
    @DeleteMapping("{vin}")
    public void deleteDealership(@PathVariable int vin)
    {
        try
        {
            var product = vehicleDao.getByVin(vin);

            if(product == null){
                throw new ResponseStatusException(HttpStatus.NOT_FOUND);
            }

            vehicleDao.delete(vin);
        }
        catch(Exception ex)
        {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Oops... our bad.");
        }
    }
}
