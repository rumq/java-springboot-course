package net.rumq.assignment13;

import org.springframework.stereotype.Repository;

@Repository("restaurantRepository")
public class RestaurantRepositoryImpl implements RestaurantRepository {
    @Override
    public String get_menu() {
        return "1. Pasta\n" + "2. Imam Bayaldi\n" + "3. Chicken";
    }

    @Override
    public void save_order(String order) {
        System.out.println("Order " + order + " saved to database");
    }

    @Override
    public void update_bill_paid(boolean bill_paid) {

    }

}