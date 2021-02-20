package pl.javastart.task;

import java.util.Scanner;

class VehicleCreator {

    Vehicle create(Scanner scanner) {
        System.out.println("Podaj typ pojazdu:");
        String typeOfVehicle = scanner.nextLine();
        System.out.println("Podaj markę pojazdu:");
        String brand = scanner.nextLine();
        System.out.println("Podaj model pojazdu:");
        String model = scanner.nextLine();
        System.out.println("Podaj rok produkcji pojazdu:");
        int yearOfProduction = scanner.nextInt();
        System.out.println("Podaj przebieg pojazdu:");
        double mileage = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Podaj VIN pojazdu:");
        String vehicleIdNumber = scanner.nextLine();
        return new Vehicle(typeOfVehicle, brand, model, yearOfProduction, mileage, vehicleIdNumber);
    }
}
