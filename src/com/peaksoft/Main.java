package com.peaksoft;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Main {
    public static GsonBuilder GSON_BUILDER = new GsonBuilder();
    public static Gson GSON = GSON_BUILDER.setPrettyPrinting().create();
    public static String GSON_WRITE = "./gson.truck";
    public static String GSON_WRITEG = "./gson.drive";

    public static void main(String[] args) {
        Truck[] trucks = {
                Truck.createTruck(1, "Renault ", new Driver(), Status.BASE),
                Truck.createTruck(2, "Volvo   ", new Driver(), Status.BASE),
                Truck.createTruck(3, "DAF XT  ", new Driver(), Status.BASE),
        };
        String gsonTruck = GSON.toJson(trucks);
        System.out.println("-------------------------------------------------------------");
        Driver[]drivers={
                Driver.cresteDrive(1,"| Asan |"),
                Driver.cresteDrive(2,"| Bakyt| "),
                Driver.cresteDrive(3,"| Uson |"),
        };
        String gsonDrive = GSON.toJson(drivers);
//        write(gsonDrive,GSON_WRITEG);
//        write(gsonTruck, GSON_WRITE);
//        read(GSON_WRITE);
        Truck.truckTab(gsonTruck);
        Driver.driveTab(gsonDrive);


        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите грузовика: ");
        int change = sc.nextInt();
        TruckService.changeTruck(trucks, null, change);
        System.out.println("#  | Truck  |  Driver  |  Status");
        System.out.println("---*--------*----------*---------");
        Truck.truckTab(gsonTruck);
        TruckService.changeDriver(drivers,change);

    }

    public static void write(String gson, String var) {
        Path path = Paths.get(var);
        try {
            Files.writeString(path, gson, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }

    public static void read(String var) {
        try {
            FileReader fileReader = new FileReader(var);
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException r) {
            System.out.println(r.getMessage());
        }
    }


}