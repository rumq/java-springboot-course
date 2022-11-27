package com.rumq.ada.restaurantsb.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyBeanWithValues {
    @Value(value = "Restaurant Artigiano")
    private String name;

    @Value("Bllok, Tirana")
    private String address;
}
