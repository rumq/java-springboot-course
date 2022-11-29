package net.rumq.assignment13;


public interface RestaurantRepository {
    public String get_menu();
    public void save_order(String order);
    void update_bill_paid(boolean bill_paid);
}