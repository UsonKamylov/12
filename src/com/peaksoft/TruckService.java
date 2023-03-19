package com.peaksoft;

import java.util.Random;
import java.util.Scanner;

public class TruckService {
    static String dr;
    static String driverName;
    static String truckName;
    static Scanner scanner = new Scanner(System.in);
    static Driver driver = new Driver();
    static Random random = new Random();

    public static void changeTruck(Truck[] trucks, Driver[] drivers, int id) {
        for (Truck truck : trucks) {
            if (truck.getDriver().getName() == null) {
                dr = " ";
            } else {
                dr = truck.getDriver().getName();
            }
            truck.getDriver().setName(" ");
            if (truck.getId() == id) {
                System.out.printf(" #: " + truck.getId());
                System.out.printf("name: " + truck.getName());
                System.out.printf("driver: " + truck.getDriver().getName());
                if (truck.getStatus().equals(Status.BASE)) {
                    System.out.println();
                    System.out.println( "Выберите статус: ");
                    System.out.println("для от правке на базу  1 ");
                    System.out.println("для отправке в пути    2 ");
                    System.out.println("для отправке на ремонт 3 ");
                    System.out.println();
                    int change = scanner.nextInt();
                    if (change == 1) {
                        randomDriver(drivers);
                        starDriving(truck.getName(), driver.getName());
                        truck.setStatus(Status.ROUTE);
                    }
                    if (change == 2){
                        truck.setStatus(Status.REPAIR);
                        starRepairing(truck.getName(),driver.getName());
                        System.out.println(truck.getStatus());
                    }
                }

            }

        }
    }





    public static void starDriving(String truckName, String driverName) {
        System.out.println("Truck " + truckName + "driver " + driverName);
        System.out.println("Mashina jolgo ketti ");
    }
    public static void starRepairing(String truckName, String driverName) {
        System.out.println("Truck " + truckName + "driver " + driverName);
        System.out.println("Mashina remontko ketti ");
    }


    public static void randomDriver(Driver[] drivers) {
        int d = random.nextInt(3) + 1;
        for (Driver driver1 : drivers) {
            if (driver1.getId() == d) {
                driver = driver1;
            }

        }
    }
    public static void changeDriver(Driver[] drivers,int id) {
        for (Driver driver1 : drivers) {
            if (driver1.getName()==null) {
                dr=" ";
                System.out.println("#  | Truck  |  Driver  |  Status");
                System.out.println("---*--------*----------*---------");
            }else {
                dr = driver.getName();
            }
                System.out.printf(" #: " + driver.getId());
                System.out.printf("name: " + driver.getName());
                System.out.printf("driver: " + driver.getName());
                System.out.println();
                System.out.println( "Выберите водитель: ");
                System.out.println(" Asan    1 ");
                System.out.println("Bakyt    2 ");
                System.out.println("Uson     3 ");
                System.out.println();
                int change2 = scanner.nextInt();
                if (change2 == 1) {
                 driver.getName().equals(driverName);
                }
                if (change2 == 2){
                    driver.getName();

                }
            }

        }

    }






