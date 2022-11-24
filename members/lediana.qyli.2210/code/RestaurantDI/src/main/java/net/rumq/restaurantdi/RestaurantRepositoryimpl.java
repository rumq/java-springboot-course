package net.rumq.restaurantdi;

import org.springframework.stereotype.Repository;

@Repository
public class RestaurantRepositoryimpl implements RestaurantRepository{
    @Override
    public void information(String menu, String staff) {
        System.out.println("From RestaurantRepository: "+menu+" Ready \n"+staff+"Ready!");
    }
}
