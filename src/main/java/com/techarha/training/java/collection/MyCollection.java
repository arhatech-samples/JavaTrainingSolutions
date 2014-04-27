package com.techarha.training.java.collection;

import java.util.*;

/**
 * @author ankit.
 */
public class MyCollection {

    public static void main(String[] args) {
        List<CarFactory.Car> myCars = CarFactory.getCarList();

        Iterator<CarFactory.Car> iterator = myCars.iterator();

        while(iterator.hasNext()){
            CarFactory.Car car = iterator.next();
        }


    }
}

class CarFactory {
    public class Car{
        private String name;
        private String model;
        private int make;

        public Car(String name, String model, int make){
            this.make=make;
            this.model=model;
            this.name=name;
        }


        public int getMake() {
            return make;
        }

        public void setMake(int make) {
            this.make = make;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static List<Car> getCarList(){

        CarFactory carFactory = new CarFactory();

        List<Car> myCarList = new ArrayList<Car>();


        myCarList.add(carFactory.new Car("fiat","optra",1234));
        myCarList.add(carFactory.new Car("fiat","optra1",1934));
        myCarList.add(carFactory.new Car("fiat","optra2",2034));
        myCarList.add(carFactory.new Car("fiat","optra",1234));
        myCarList.add(carFactory.new Car("suzuki","swift",2009));
        myCarList.add(carFactory.new Car("suzuki","swift Desire",2012));

        return myCarList;
    }



}