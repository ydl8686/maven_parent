package org.example.service;

import org.example.dao.UserDao;

public class UserService {
    public static void testService(){
        System.out.println("UserService Testing...");
        //调用maven_dao
        UserDao.testDao();
    }
}
