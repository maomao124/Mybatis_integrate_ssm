package mao.mybatis_integrate_ssm;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Project name(项目名称)：Mybatis_integrate_ssm
 * Package(包名): mao.mybatis_integrate_ssm
 * Class(类名): AccountController
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/17
 * Time(创建时间)： 21:14
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Controller
public class AccountController
{
    @Resource
    private AccountService accountService;

    //保存
    @RequestMapping(value = "/save", produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String save(Account account)
    {
        accountService.save(account);
        return "保存成功";
    }

    //查询
    @RequestMapping("/findAll")
    public ModelAndView findAll()
    {
        List<Account> accountList = accountService.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("accountList", accountList);
        modelAndView.setViewName("accountList");
        return modelAndView;
    }
}
