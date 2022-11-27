package net.rumq.restaurantdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service("RestaurantService")

public class RestaurantServiceimpl implements RestaurantService{

    @Autowired
    private RestaurantRepository repository;

    @Override
    public void service(String menu, String staff) {
        System.out.println("From RestaurantService: "+menu+" Ready \n"+staff+" Ready!");
        repository.information(menu, staff);
    }
}
