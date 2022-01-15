package com.company.lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyFirstLambdas {

    public static void main(String[] args) {

        List<User> users =  new ArrayList<>();
        User u1 = new User(1,"kasun");
        User u2 = new User(2,"charith");
        User u3 = new User(3,"ajith");

        users.add(u1);
        users.add(u2);
        users.add(u3);


        Collections.sort(users , (nu1,nu2) -> nu1.getName().compareTo(nu2.getName()) );










    }

}
