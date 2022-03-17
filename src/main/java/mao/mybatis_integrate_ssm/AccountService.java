package mao.mybatis_integrate_ssm;

import java.util.List;

/**
 * Project name(项目名称)：Mybatis_integrate_ssm
 * Package(包名): mao.mybatis_integrate_ssm
 * Interface(接口名): AccountService
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/17
 * Time(创建时间)： 21:18
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public interface AccountService
{
    public void save(Account account);

    public List<Account> findAll();

}
