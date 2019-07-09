package ro.jademy.carrental;

import ro.jademy.carrental.make.Car;

import java.util.ArrayList;
import java.util.List;

public class Shop {


    private List<Customer> customers = new ArrayList<>();
    private List<Salesman> salesmen = new ArrayList<>();
    private List<Car> carList = new ArrayList<>();

    public Shop(List<Salesman> salesmen, List<Car> carList) {
        this.salesmen.addAll(salesmen);
        this.carList.addAll(carList);
    }


    // Q: what fields and methods should this class contain?

    public boolean login(String username, String password) {
        for (Salesman salesman : salesmen) {
            if (username.equals(salesman.getUsername()) && password.equals(salesman.getPassword())) {
                showMenu();
                return true;
            }
        }


        System.out.println("Wrong credentials");
        return false;
    }

    public void showMenu() {

        System.out.println(" -----------------------------------------------");
        System.out.println("|    Welcome to the Jademy Car Rental Service   |");
        System.out.println(" -----------------------------------------------");
        System.out.println();
        System.out.println("                    MAIN MENU                   ");
        System.out.println("1. List all cars");
        System.out.println("2. List available cars");
        System.out.println("3. List rented cars");
        System.out.println("4. Check income");
        System.out.println("5. Logout");
        System.out.println("6. Exit");

        int choice = 6;
        switch (choice) {
            case 1:
                showAllCars();
                break;
            case 2:
                showAllAvailableCars();
                break;
            case 3:
                showAllRentedCars();
            case 4:

        }
    }

    public void showListMenuOptions() {

        System.out.println("Select an action from below:");
        System.out.println("1. Filter by make");
        System.out.println("2. Filter by model");
        System.out.println("3. Filter by budget");
        // TODO: add additional filter methods based on car specs

        System.out.println("4. Back to previous menu");

    }

    public void calculatePrice(int numberOfDays) {
        // TODO: apply a discount to the base price of a car based on the number of rental days
        // TODO: document the implemented discount algorithm

        // TODO: for a more difficult algorithm, change this method to include date intervals and take into account
        //       weekdays and national holidays in which the discount should be smaller

        // Q: what should be the return type of this method?
    }


    public ArrayList<Car> getCarsByModel(String model) {
        ArrayList<Car> carsByModel = new ArrayList<>();
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getModel().equalsIgnoreCase(model)) {
                carsByModel.add(carList.get(i));
            }
        }
        return carsByModel;
    }

    public ArrayList<Car> getCarsByCarType(String carType) {
        ArrayList<Car> carsByCarType = new ArrayList<>();
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getCarType().equalsIgnoreCase(carType)) {
                carsByCarType.add(carList.get(i));
            }
        }
        return carsByCarType;
    }

    public ArrayList<Car> getCarsByCarMake(String make) {
        ArrayList<Car> carsByCarMake = new ArrayList<>();
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getMake().equalsIgnoreCase(make)) {
                carsByCarMake.add(carList.get(i));
            }
        }
        return carsByCarMake;
    }

    public ArrayList<Car> getCarsbyBasePriceMin(int price) {
        ArrayList<Car> carsByBasePrice = new ArrayList<>();
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getBasePrice() <= price) {
                carsByBasePrice.add(carList.get(i));
            }
        }
        return carsByBasePrice;
    }

    public ArrayList<Car> getCarsbyBasePriceMax(int price) {
        ArrayList<Car> carsByBasePrice = new ArrayList<>();
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getBasePrice() >= price) {
                carsByBasePrice.add(carList.get(i));
            }
        }
        return carsByBasePrice;
    }





    public void showAllCars() {
        for (Car car: carList ) {
            System.out.println(car);

        }

    }




    public void showAllAvailableCars () {
        for (Car car: carList) {
            if (!car.isRented()) {
                System.out.println(car);
            }
        }

    }

    public void showAllRentedCars () {
        for (Car car: carList) {
            if (car.isRented()) {
                System.out.println(car);
            }
        }

    }








    public Shop(List<Car> carList) {
        this.carList = carList;
    }


    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public List<Salesman> getSalesmen() {
        return salesmen;
    }

    public void setSalesmen(List<Salesman> salesmen) {
        this.salesmen = salesmen;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "carList=" + carList +
                '}';
    }
}
