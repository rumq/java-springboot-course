package com.example.dependencyinjection;

import org.springframework.stereotype.Repository;

@Repository("restaurantRepository")
public class RestaurantRepositoryImpl implements RestaurantRepository {
    @Override
    public String get_menu() {
        return "1. Fried Rice\n" + "2. lentil soup\n" + "3. Flat bread";
    }

    @Override
    public void save_order(String order) {
        System.out.println("Order " + order + " saved to database");
    }

    @Override
    public void update_bill_paid(boolean is_bill_paid) {
        System.out.println("updated bill paid column to " + is_bill_paid);
    }
}
