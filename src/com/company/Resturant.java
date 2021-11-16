package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class Resturant {
    int NO_TWO;
    int NO_FOUR;
    int NO_SIX;
    Menu menu;

    List<Order> orderList;
    List<Customer> customerList;
    List<Waiter> waiterList;
    List<Chef> chefList;



    public Resturant(int NO_TWO, int NO_FOUR, int NO_SIX) {
        this.NO_TWO = NO_TWO;
        this.NO_FOUR = NO_FOUR;
        this.NO_SIX = NO_SIX;
        this.menu=new Menu();
    }

    public boolean checkState(int noOfCustomer) {
//  ANUBHAV:      If else condition employ
//        switch (noOfCustomer) {
//            case 2:
//                if(NO_TWO==0)
//                    return false;
//                else
//                    return true;
//                break;
//            case 4:
//                if(NO_FOUR==0)
//                    return false;
//                else
//                    return true;
//                break;
//            case 6:
//                if(NO_SIX==0)
//                    return false;
//                else
//                    return true;
//                break;
//        }
        return true;
    }

    public void bookSeat(int noOfCustomer) {

    }

    public static void main(String[] args) {

    }

}
