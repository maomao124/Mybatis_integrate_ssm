package mao.mybatis_integrate_ssm;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Project name(项目名称)：Mybatis_integrate_ssm
 * Package(包名): mao.mybatis_integrate_ssm
 * Class(测试类名): AccountMapperTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/17
 * Time(创建时间)： 22:33
 * Version(版本): 1.0
 * Description(描述)： 测试类
 */

class AccountMapperTest
{

    @Test
    void save() throws IOException
    {
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);

        Account account = new Account();
        account.setId(1);
        account.setName("z");
        account.setMoney(2000.0);

        accountMapper.save(account);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    void save1()
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Bean.xml");
        AccountMapper accountMapper = applicationContext.getBean(AccountMapper.class);
        System.out.println(accountMapper);

    }

    @Test
    void findAll() throws IOException
    {
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
        List<Account> list = accountMapper.findAll();
        for (Account account : list)
        {
            System.out.println(account);
        }
    }

    @Test
    void findAll1()
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Bean.xml");
        AccountMapper accountMapper = applicationContext.getBean(AccountMapper.class);
        System.out.println(accountMapper);
        List<Account> list = accountMapper.findAll();
        for (Account account : list)
        {
            System.out.println(account);
        }
    }

    @Test
    void findAll2()
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Bean.xml");
        AccountServiceImpl accountService = applicationContext.getBean(AccountServiceImpl.class);
        List<Account> list = accountService.findAll();
        for (Account account : list)
        {
            System.out.println(account);
        }

    }
}