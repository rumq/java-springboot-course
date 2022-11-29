package net.rumq.assignment13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("restaurantService")
public class RestaurantServiceImpl implements RestaurantService {
    @Autowired
    private RestaurantRepository repository;

    @Override
    public void serve_menu() {

    String menu = repository.get_menu();
        System.out.println("Here is the menu: \n" + menu);

}

    @Override
    public void take_order(String order) {

        repository.save_order(order);
        System.out.println("Processing Order " + order);

    }

    @Override
    public void serve_order() {

        System.out.println("Order Served");
    }

    @Override
    public void billing(boolean bill_paid) {
        repository.update_bill_paid(bill_paid);

    }


}