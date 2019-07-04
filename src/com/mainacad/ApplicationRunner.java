package com.mainacad;

import com.mainacad.model.*;
import com.mainacad.service.CartService;
import com.mainacad.service.UserGenerationService;

import java.util.Date;

public class ApplicationRunner {

    public static void main(String[] args) {
        Date birthDay = UserGenerationService.getDate(1982, 7, 22);
        User user = new User("ignatenko2207", "123456", "Alex", "Ignatenko", birthDay, Gender.MALE);

        Item item = new Item("abcde01", "some name", 15.56);

        Order order = new Order(item, 12);

        Cart cart = new Cart(user,order, new Date().getTime());

        System.out.println(CartService.getTotalSum(cart));

    }
}
