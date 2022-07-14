package com.zhr.mybatis;
import com.zhr.mybatis.mapper.Usermapper;
import com.zhr.mybatis.pojo.User;
import com.zhr.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        SqlSession intersession = SqlSessionUtils.intersession();
        Usermapper mapper = intersession.getMapper(Usermapper.class);
        List<User> t_user = mapper.getUserByTableName("t_user");
        t_user.forEach(System.out::println);
    }
}
