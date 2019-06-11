package com.example.mvc.test;


import com.example.mvc.MyDSLContest;
import com.example.mvc.table.tables.pojos.TAccount;
import org.jooq.DSLContext;

import java.util.List;

import static com.example.mvc.table.tables.TAccount.t_account;

public class Test1 {



    private static MyDSLContest myDSLContest = new MyDSLContest();
    private static DSLContext dslContext = myDSLContest.test();


    public static void main(String [] args){


        List<TAccount> list = dslContext.select()
                .from(t_account)
                .where(t_account.username.like("test%"))
                .fetchInto(TAccount.class);


    }
}
