package com.peaksoft;

import static com.peaksoft.Main.GSON;

public class Driver {
    private int id;
    private String name;

    public static Driver cresteDrive(int id, String name){
        Driver driver= new Driver();
        driver.id=id;
        driver.name=name;

        return driver;
    }
    public static void driveTab(String gson) {
        Driver[] drivers = GSON.fromJson(gson,Driver[].class);
        System.out.println("#    Driver |  Truck");
        System.out.println("---*--------*--------*--------");
        for (Driver driver:drivers) {
            System.out.println(driver);

        }

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return ""   +id+"   "+name  ;
    }
}
