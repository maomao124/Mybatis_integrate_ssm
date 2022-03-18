package mao.mybatis_integrate_ssm.mapper;

import mao.mybatis_integrate_ssm.data.Account;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Project name(项目名称)：Mybatis_integrate_ssm
 * Package(包名): mao.mybatis_integrate_ssm
 * Interface(接口名): AccountMapper
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/17
 * Time(创建时间)： 21:17
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Mapper
public interface AccountMapper
{
    public void save(Account account);

    public List<Account> findAll();
}
