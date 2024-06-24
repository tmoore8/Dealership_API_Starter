package com.ps.dealership_api_starter.data.mysql;

import com.ps.dealership_api_starter.data.VehicleDao;
import com.ps.dealership_api_starter.models.Dealership;
import com.ps.dealership_api_starter.models.Vehicle;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySqlVehicleDao extends MySqlDaoBase implements VehicleDao {
    public MySqlVehicleDao(DataSource dataSource)
    {
        super(dataSource);
    }

    @Override
    public Vehicle getByVin(int vin) {
        List<Vehicle> vehicles = new ArrayList<>();
        String sql = "SELECT * FROM vehicles WHERE vin = ?";
        try (Connection connection = getConnection())
        {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,vin);
            ResultSet row = statement.executeQuery();
            if(row.next())
            {
                return mapRow(row);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return null;
    }
    @Override
    public List<Vehicle> searchByMinPrice(double price)
    {
        List<Vehicle> vehicles = new ArrayList<>();
        String sql = "SELECT * FROM vehicles WHERE price > ?";
        try (Connection connection = getConnection())
        {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setDouble(1,price);

            ResultSet row = statement.executeQuery();

            while (row.next())
            {
                Vehicle vehicle = mapRow(row);
                vehicles.add(vehicle);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return vehicles;
    }

    @Override
    public List<Vehicle> searchByMaxPrice(double price)
    {
        List<Vehicle> vehicles = new ArrayList<>();
        String sql = "SELECT * FROM vehicles WHERE price < ?";
        try (Connection connection = getConnection())
        {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setDouble(1,price);

            ResultSet row = statement.executeQuery();

            while (row.next())
            {
                Vehicle vehicle = mapRow(row);
                vehicles.add(vehicle);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return vehicles;
    }

    @Override
    public List<Vehicle> searchByMake(String make)
    {
        List<Vehicle> vehicles = new ArrayList<>();
        String sql = "SELECT * FROM vehicles WHERE make = ?";
        try (Connection connection = getConnection())
        {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,make);

            ResultSet row = statement.executeQuery();

            while (row.next())
            {
                Vehicle vehicle = mapRow(row);
                vehicles.add(vehicle);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return vehicles;
    }

    @Override
    public List<Vehicle> searchByModel(String model)
    {
        List<Vehicle> vehicles = new ArrayList<>();
        String sql = "SELECT * FROM vehicles WHERE model = ?";
        try (Connection connection = getConnection())
        {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,model);

            ResultSet row = statement.executeQuery();

            while (row.next())
            {
                Vehicle vehicle = mapRow(row);
                vehicles.add(vehicle);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return vehicles;
    }

    @Override
    public List<Vehicle> searchByMinYear(int year)
    {
        List<Vehicle> vehicles = new ArrayList<>();
        String sql = "SELECT * FROM vehicles WHERE year > ?";
        try (Connection connection = getConnection())
        {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,year);

            ResultSet row = statement.executeQuery();

            while (row.next())
            {
                Vehicle vehicle = mapRow(row);
                vehicles.add(vehicle);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return vehicles;
    }

    @Override
    public List<Vehicle> searchByMaxYear(int year)
    {
        List<Vehicle> vehicles = new ArrayList<>();
        String sql = "SELECT * FROM vehicles WHERE year < ?";
        try (Connection connection = getConnection())
        {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,year);

            ResultSet row = statement.executeQuery();

            while (row.next())
            {
                Vehicle vehicle = mapRow(row);
                vehicles.add(vehicle);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return vehicles;
    }

    @Override
    public List<Vehicle> searchByMinMiles(int odometer)
    {
        List<Vehicle> vehicles = new ArrayList<>();
        String sql = "SELECT * FROM vehicles WHERE odometer > ?";
        try (Connection connection = getConnection())
        {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,odometer);

            ResultSet row = statement.executeQuery();

            while (row.next())
            {
                Vehicle vehicle = mapRow(row);
                vehicles.add(vehicle);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return vehicles;
    }

    @Override
    public List<Vehicle> searchByMaxMiles(int odometer)
    {
        List<Vehicle> vehicles = new ArrayList<>();
        String sql = "SELECT * FROM vehicles WHERE odometer < ?";
        try (Connection connection = getConnection())
        {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,odometer);

            ResultSet row = statement.executeQuery();

            while (row.next())
            {
                Vehicle vehicle = mapRow(row);
                vehicles.add(vehicle);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return vehicles;
    }

    @Override
    public List<Vehicle> searchByColor(String color)
    {
        List<Vehicle> vehicles = new ArrayList<>();
        String sql = "SELECT * FROM vehicles WHERE color = ?";
        try (Connection connection = getConnection())
        {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,color);

            ResultSet row = statement.executeQuery();

            while (row.next())
            {
                Vehicle vehicle = mapRow(row);
                vehicles.add(vehicle);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return vehicles;
    }

    @Override
    public List<Vehicle> searchByType(String vehicleType)
    {
        List<Vehicle> vehicles = new ArrayList<>();
        String sql = "SELECT * FROM vehicles WHERE vehicle_type > ?";
        try (Connection connection = getConnection())
        {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,vehicleType);

            ResultSet row = statement.executeQuery();

            while (row.next())
            {
                Vehicle vehicle = mapRow(row);
                vehicles.add(vehicle);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return vehicles;
    }

    @Override
    public Vehicle create(Vehicle vehicle)
    {
        String sql = "INSERT INTO vehicles(vin,year,make,model,vehicle_type,color,odometer,price,sold)" +"VALUES(?,?,?,?,?,?,?,?,?)";
        try(Connection connection = getConnection())
        {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,vehicle.getVin());
            statement.setInt(2,vehicle.getYear());
            statement.setString(3,vehicle.getMake());
            statement.setString(4,vehicle.getModel());
            statement.setString(5,vehicle.getVehicleType());
            statement.setString(6,vehicle.getColor());
            statement.setInt(7,vehicle.getOdometer());
            statement.setDouble(8,vehicle.getPrice());
            statement.setBoolean(9, vehicle.isSold());
            statement.executeUpdate();

        }
        catch (SQLException e)
        {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public void update(int vin, Vehicle vehicle)
    {
        String sql = "UPDATE vehicles" +
                "SET year = ?" +
                ", make = ?" +
                ", model = ?" +
                ", vehicle_type = ?" +
                ", color = ?" +
                ", odometer = ?" +
                ", price = ?" +
                ", sold = ?" +
                "WHERE vin = ?";

        try(Connection connection = getConnection())
        {
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setInt(1,vehicle.getYear());
            statement.setString(2,vehicle.getMake());
            statement.setString(3,vehicle.getModel());
            statement.setString(4,vehicle.getVehicleType());
            statement.setString(5,vehicle.getColor());
            statement.setInt(6,vehicle.getOdometer());
            statement.setDouble(7,vehicle.getPrice());
            statement.setBoolean(8, vehicle.isSold());
            statement.setInt(9,vehicle.getVin());
            statement.executeUpdate();

        }
        catch (SQLException e)
        {
            e.printStackTrace();
            throw new RuntimeException(e);
        }


    }

    @Override
    public void delete(int vin)
    {
        String sql = "DELETE FROM vehicles " +
                " WHERE vin = ?;";

        try (Connection connection = getConnection())
        {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, vin);

            statement.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }

    protected static Vehicle mapRow(ResultSet row) throws SQLException
    {
        int vin = row.getInt("vin");
        int year = row.getInt("year");
        String make = row.getString("make");
        String model = row.getString("model");
        String vehicleType = row.getString("vehicle_type");
        String color = row.getString("color");
        int odometer= row.getInt("odometer");
        double price = row.getDouble("price");
        boolean sold = row.getBoolean("sold");

        return new Vehicle(vin,year,make,model,vehicleType,color,odometer,price,sold);
    }
}
