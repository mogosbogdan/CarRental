package ro.jademy.carrental;

import ro.jademy.carrental.make.*;

import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Q: this is the main entry point of our program. What should we do here?

        List<Car> availableCarList = new ArrayList<>();

        Car A1 = new Dacia("Logan", 2018, "Sedan", 5, "Blue", 5000, new Engine("Diesel", true, 1500));
        Car A2 = new Dacia("Duster", 2017, "SUV", 5, "Gray", 7000, new Engine("Diesel", true, 1500));
        Car A3 = new BMW("420i", 2016, "Convertible", 3, "black", 11000, new Engine("Petrol", false, 2000));
        Car A4 = new Audi("A4", 2017, "Sedan", 5, "Silver", 9000, new Engine("Diesel", true, 2000));
        Car A5 = new Mercedes("S Classe", 2018, "Sedan", 5, "Black", 15000, new Engine("Petrol", false, 6000));
        Car A6 = new Skoda("Octavia", 2016, "Sedan", 5, "Red", 7500, new Engine("Petrol", true, 1900));
        Car A7 = new Volkswagen("CC", 2017, "Sedan", 5, "Black", 8200, new Engine("Diesel", false, 2000));
        Car A8 = new Volkswagen("Passat", 2018, "Sedan", 5, "Blue", 7500, new Engine("Diesel", true, 1900));
        Car A9 = new Renault("Megane", 2018, "Hatchback", 5, "Red", 7000, new Engine("Petrol", true, 1500), true);



        availableCarList.add(A1);
        availableCarList.add(A2);
        availableCarList.add(A3);
        availableCarList.add(A4);
        availableCarList.add(A5);
        availableCarList.add(A6);
        availableCarList.add(A7);
        availableCarList.add(A8);
        availableCarList.add(A9);
        for (Car c : availableCarList) System.out.println(c);

        System.out.println("===================");


        ArrayList<Car> rentedCarList = new ArrayList<>();







        //Shop rentedAirport = new Shop(rentedCarList);

      ArrayList<Salesman> salesmenList = new ArrayList<>();
      Salesman S1 = new Salesman ("Ion", "Ionescu" , "Ion", "1234");
      Salesman S2 = new Salesman("George" , "Georgescu", "George" , "4321");

      salesmenList.add(S1);
      salesmenList.add(S2);



        Shop budgetRentals = new Shop(salesmenList, availableCarList);

        //System.out.println(budgetRentals.getCarsByCarType("Sedan"));
        //System.out.println(budgetRentals.getCarsByModel("Duster"));

        System.out.println(budgetRentals.getCarsByCarMake("BMW"));
        System.out.println("=========");
        System.out.println(budgetRentals.getCarsbyBasePriceMin(10000));

        System.out.println(S1.getUsername().toString());
        System.out.println("====================showallcars");

        budgetRentals.showAllCars();
        availableCarList.get(0).setRented(true);

        System.out.println("======showavailable");
        budgetRentals.showAllAvailableCars();

        System.out.println("=======rented");
        budgetRentals.showAllRentedCars();

        System.out.println("==========comparing");
        System.out.println(A1.compareToBasePrice(A2));


        //System.out.println(budgetRentals.login("Ion", "1234"));
        Scanner kbd = new Scanner(System.in);
        boolean login = false;
        while (!login) {
            System.out.println("Enter username");
            String username = kbd.nextLine();
            System.out.println("Enter password");
            String password = kbd.nextLine();
            login = budgetRentals.login(username, password);
        }
        if (login == true) {
            budgetRentals.showMenu();

        }else{
            System.out.println("Blocked ! ");
        }





//        Scanner kbd = new Scanner(System.in);
//        int index;
//        while (true) {
//            System.out.println("Enter username");
//            String name = kbd.nextLine();
//            if (salesmenList.toString().contains(name)) {
//                index = salesmenList.indexOf(name);
//                break;
//
//            }
//
//        }
//
//        System.out.println("Enter Password");
//        for (int i = 3 ; i>0; i--) {
//            System.out.println("Enter password. You have "+i+" chances left");
//            String password = kbd.nextLine();
//            if (password.equalsIgnoreCase(salesmenList.toString())) {
//                break;
//
//            }
//        }
//
//        System.out.println("Success");










    }


}


