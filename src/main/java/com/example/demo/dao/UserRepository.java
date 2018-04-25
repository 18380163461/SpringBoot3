package com.example.demo.dao;


import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Description:
 * @author: youpd@asiainfo.com
 * @create: 2018-04-25 10:51
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}