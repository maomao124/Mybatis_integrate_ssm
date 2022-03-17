package mao.mybatis_integrate_ssm;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Project name(项目名称)：Mybatis_integrate_ssm
 * Package(包名): mao.mybatis_integrate_ssm
 * Class(类名): AccountServiceImpl
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/17
 * Time(创建时间)： 21:18
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Service("accountService")
public class AccountServiceImpl implements AccountService
{
    @Resource
    private AccountMapper accountMapper;

    @Override
    public void save(Account account)
    {
        accountMapper.save(account);
    }

    @Override
    public List<Account> findAll()
    {
        return accountMapper.findAll();
    }
}
