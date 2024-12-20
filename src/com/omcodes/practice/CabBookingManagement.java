package com.omcodes.practice;

import com.omcodes.practice.model.Booking;
import com.omcodes.practice.model.Driver;
import com.omcodes.practice.model.Passenger;
import com.omcodes.practice.model.Vehicle;

import java.util.Scanner;

public class CabBookingManagement {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        CabBookingManagement swcbm = new CabBookingManagement();
        int choice;

        do {
            System.out.println("\n--- Cab Booking Management System ---");
            System.out.println("1. Create Passenger");
            System.out.println("2. Create Driver");
            System.out.println("3. Create Vehicle");
            System.out.println("4. Create Booking");
            System.out.println("0. Exit");
            System.out.print("Select an option: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    Passenger passenger = swcbm.createPassenger();
                    System.out.println("Passenger created: " + passenger);
                    break;
                case 2:
                    Driver driver = swcbm.createDriver();
                    System.out.println("Driver created: " + driver);
                    break;
                case 3:
                    Vehicle vehicle = swcbm.createVehicle();
                    System.out.println("Vehicle created: " + vehicle);
                    break;
                case 4:
                    Booking booking = swcbm.createBooking();
                    System.out.println("Booking created: " + booking);
                    break;
                case 0:
                    System.out.println("Thank you for using the system!");
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        } while (choice != 0);
    }

    private Passenger createPassenger() {
        System.out.println("Enter Passenger Details:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Phone: ");
        String phone = sc.nextLine();
        System.out.print("Address: ");
        String address = sc.nextLine();
        Passenger passenger = new Passenger();
        passenger.setName(name);
        passenger.setEmail(email);
        passenger.setPhone(phone);
        passenger.setAddress(address);
        return passenger;
    }

    private Driver createDriver() {
        System.out.println("Enter Driver Details:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Phone: ");
        String phone = sc.nextLine();
        System.out.print("License Number: ");
        String license = sc.nextLine();
        Driver driver = new Driver();
        driver.setDriverName(name);
        driver.setPhone(phone);
        driver.setLicenseNumber(license);
        return driver;
    }

    private Vehicle createVehicle() {
        System.out.println("Enter Vehicle Details:");
        System.out.print("Model: ");
        String model = sc.nextLine();
        System.out.print("Registration Number: ");
        String regNumber = sc.nextLine();
        System.out.print("Color: ");
        String color = sc.nextLine();
        System.out.print("Seat Capacity: ");
        int seats = Integer.parseInt(sc.nextLine());
        System.out.print("Per Km Rate: ");
        double rate = Double.parseDouble(sc.nextLine());
        Vehicle vehicle = new Vehicle();
        vehicle.setModel(model);
        vehicle.setRegistrationNumber(regNumber);
        vehicle.setColor(color);
        vehicle.setSeatCapacity(seats);
        vehicle.setPerKmRate(rate);
        return vehicle;
    }

    private Booking createBooking() {
        System.out.println("Enter Booking Details:");
        System.out.print("Passenger Name: ");
        String passengerName = sc.nextLine();
        System.out.print("Driver Name: ");
        String driverName = sc.nextLine();
        System.out.print("Vehicle Id: ");
        String vehicleModel = sc.nextLine();
        System.out.print("Pickup Location: ");
        String pickup = sc.nextLine();
        System.out.print("Drop Location: ");
        String drop = sc.nextLine();
        System.out.print("Distance (in km): ");
        double distance = Double.parseDouble(sc.nextLine());
        Booking booking = new Booking();
        booking.setPassengerName(passengerName);
        booking.setDriverName(driverName);
        booking.setVehicleId(vehicleModel);
        booking.setPickupLocation(pickup);
        booking.setDropLocation(drop);
        booking.setDistance(distance);
        return booking;
    }
}
