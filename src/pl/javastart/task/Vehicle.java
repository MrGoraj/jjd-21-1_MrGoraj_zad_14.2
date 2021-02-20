package pl.javastart.task;

class Vehicle {

    private String typeOfVehicle;
    private String brand;
    private String model;
    private int yearOfProduction;
    private double mileage;
    private String vehicleIdNumber;

    Vehicle(String typeOfVehicle, String brand, String model, int yearOfProduction,
            double mileage, String vehicleIdNumber) {
        this.typeOfVehicle = typeOfVehicle;
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.mileage = mileage;
        this.vehicleIdNumber = vehicleIdNumber;
    }

    @Override
    public String toString() {
        return "pojazd " + typeOfVehicle + " " + brand + " " + model + " " + yearOfProduction + " " + mileage + " " + vehicleIdNumber;
    }
}