package net.rumq.assignment13;

public interface RestaurantService {
    public void serve_menu();

    public void take_order(String order);

    public void serve_order();

    public void billing(boolean bill_paid);
}