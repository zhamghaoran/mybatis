package com.zhr.mybatis.mapper;

import com.zhr.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface Usermapper {
    List<User> getUser();

    User getUserByUsername(String username);

    //    设置参数可以直接调用username和password
    User checkLogin(@Param("username") String username, @Param("password") String password);

    // 传入一个，map也可以直接访问参数
    User checkLoginMap(Map<String, Object> map);

    int insertUser(User user);

    Integer getcount();

    //  设置返回的map中的主键为id
    Map<String, Object> getUserByIdToMap(@Param("id") Integer id);

    @MapKey("id")
    Map<String, Object> getAllUserToMap();

    List<User> getUserByLike(@Param("username1") String username);

    int deletemore(@Param("ids") String ids);
    //    查询指定表的数据
    List<User> getUserByTableName(@Param("tableName") String tableName);
}
