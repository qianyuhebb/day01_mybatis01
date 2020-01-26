package com.itcast.test;

import com.itcast.dao.IUserDao;
import com.itcast.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * 时间：  2020/1/26
 * 创建者：  Administrator 钟文
 * 描述：
 * 参数：
 * 返回值：
 **/
public class MybatisTest {
    /**
     * 入门案例
     * @param args
     */
    public static void main(String[] args) throws Exception {
        //1.读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlsessionFactory工厂
        SqlSessionFactoryBuilder builder =new SqlSessionFactoryBuilder();
        SqlSessionFactory factory =builder.build(in);
        //3.使用工厂生产SqlSession
        SqlSession Session = factory.openSession();
        //4.使用Sqlsession创建Dao接口代理对象
        IUserDao userDao = Session.getMapper(IUserDao.class);
        //5.使用代理对象执行方法
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }


        //6.释放资源
        Session.close();
        in.close();
    }
}
