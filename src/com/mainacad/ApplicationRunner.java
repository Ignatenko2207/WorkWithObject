package com.mainacad;

import com.mainacad.model.Gender;
import com.mainacad.model.User;
import com.mainacad.service.UserGenerationService;

import java.util.Date;

public class ApplicationRunner {

    public static void main(String[] args) {
        Date birthDay = UserGenerationService.getDate(1982, 7, 22);
        User user1 = new User("ignatenko2207", "123456", "Alex", "Ignatenko", birthDay, Gender.MALE);
        User user2 = new User("ignatenko", "123456", "Alex", "Ignatenko", birthDay, Gender.MALE);

        System.out.println(user1);
        System.out.println(user1.equals(user2));
    }
}
