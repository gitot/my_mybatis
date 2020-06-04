package com.guyot.demo.mybatis;


public interface UserDao {
    //@Select(value = "select * from user where id = #{id}")
    User getUserById(Long id);

}
