package com.example.mvc.dao;

import com.example.mvc.MyDSLContest;
import com.example.mvc.table.tables.pojos.TAccount;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.util.List;

import static com.example.mvc.table.tables.TAccount.t_account;


@Repository("dao")
public class AccountDao {



    private MyDSLContest myDSLContest = new MyDSLContest();

    private DSLContext dsl = myDSLContest.test();

        public  List<TAccount> selectAccountByUsername(String username){
            return dsl.select()
                    .from(t_account)
                    .where(t_account.username.like("%"+username+"%"))
                    .and(t_account.is_admin.eq(Byte.valueOf("0")))
                    .fetchInto(TAccount.class);

        }
}
