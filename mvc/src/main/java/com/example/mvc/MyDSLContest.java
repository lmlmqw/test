package com.example.mvc;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDSLContest {

    private  String userName = "root";
    private  String password = "root";
    private  String url = "jdbc:mysql://localhost:3306/kelu?useUnicode=true&characterEncoding=UTF-8&serverTimezone=GMT";
    public final  DSLContext dsl = test();

    public  DSLContext test() {

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, userName, password);
            return DSL.using(connection, SQLDialect.MYSQL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;


    }
}
