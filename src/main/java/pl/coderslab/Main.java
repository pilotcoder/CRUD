package pl.coderslab;

import pl.coderslab.utils.UserDao;

import java.sql.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try (Connection conn = DbUtil.getConnection()) {
            System.out.println("done");

        } catch (Exception e) {
            e.printStackTrace();
        }

//        String str = UserDao.hashPassword("hasło");
//        System.out.println(str);

 //       UserDao userDao = new UserDao();
//        User user = new User();
//        user.setUsername("Piotrula");
//        user.setPassword("aaa");
//        user.setEmail("hhh@wp.pl");
//       userDao.create(user);
//        System.out.println(user.toString());

 //      User read = userDao.read(3);
 //       System.out.println(read);

//        userDao.delete(2);
 //       User[] all = userDao.findAll();
 //       System.out.println(Arrays.toString(all));

//        UserDao ud = new UserDao();
//        User change = ud.read(1);
//        System.out.println(change);
//        change.setUsername("Damian");
//        change.setEmail("damian@wp.pl");
//        change.setPassword("domek");
//        ud.update(change);


    }





}