package com.example.dependencyinjection;

public interface RestaurantRepository {
   public String get_menu();
   public void save_order(String order);
   public void update_bill_paid(boolean is_bill_paid);
}
