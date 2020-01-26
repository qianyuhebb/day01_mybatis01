package com.itcast.dao;

import com.itcast.domain.User;

import java.util.List;

/**
 * 时间：  2020/1/26
 * 创建者：  Administrator 钟文
 * 描述：
 * 参数：
 * 返回值：
 **/
public interface IUserDao {

    /**
     * 查询所有
     * @return
     */
    List<User> findAll();
}
