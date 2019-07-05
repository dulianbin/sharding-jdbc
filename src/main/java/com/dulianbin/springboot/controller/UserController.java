package com.dulianbin.springboot.controller;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dulianbin.springboot.entity.User;
import com.dulianbin.springboot.entity.enums.AgeEnum;
import com.dulianbin.springboot.entity.enums.PhoneEnum;
import com.dulianbin.springboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 代码生成器，参考源码测试用例：
 * <p>
 * /mybatis-plus/src/test/java/com/baomidou/mybatisplus/test/generator/MysqlGenerator.java
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    /**
     * 分页 PAGE
     */
    @GetMapping("/test")
    public IPage<User> test() {
        IPage<User> page=new Page<User>(0, 12);
        return userService.page(page);
    }

    /**
     * 增删改查 CRUD
     */
    @GetMapping("/test2")
    public User test2() {
        System.err.println("删除一条数据：" + userService.removeById(1L));
        System.err.println("deleteAll：" + userService.deleteAll());
        System.err.println("插入一条数据：" + userService.save(new User(10L, "张三", AgeEnum.TWO, 1,2)));
        User user = new User("张三", AgeEnum.TWO, 1,2);
        boolean result = userService.save(user);
        // 自动回写的ID
        Long id = user.getId();
        System.err.println("插入一条数据：" + result + ", 插入信息：" + user.toString());
        System.err.println("查询：" + userService.getById(id).toString());
        System.err.println("更新一条数据：" + userService.updateById(new User(1L, "三毛", AgeEnum.ONE, 1,1)));
        for (int i = 0; i < 5; ++i) {
            userService.save(new User(Long.valueOf(100 + i), "张三" + i, AgeEnum.ONE, 1,3));
        }
        return userService.getById(1L);
    }

    /**
     * 插入 OR 修改
     */
    @GetMapping("/test3")
    public User test3() {
        User user = new User(1L, "王五", AgeEnum.ONE, 1,1);
        user.setPhone(PhoneEnum.CT);
        userService.saveOrUpdate(user);
        return userService.getById(1L);
    }

    @GetMapping("/add")
    public Object addUser() {
        User user = new User("张三'特殊`符号", AgeEnum.TWO, 1,2);
        user.setPhone(PhoneEnum.CUCC);
        JSONObject result = new JSONObject();
        result.put("result", userService.save(user));
        return result;
    }

    @GetMapping("/selectsql")
    public Object getUserBySql() {
        JSONObject result = new JSONObject();
        result.put("records", userService.selectListBySQL());
        return result;
    }

    /**
     * 7、分页 size 一页显示数量  current 当前页码
     * 方式一：http://localhost:8080/user/page?size=1&current=1<br>
     * 方式二：http://localhost:8080/user/pagehelper?size=1&current=1<br>
     */

    // 参数模式分页
    @GetMapping("/page")
    public Object page(Page page) {
        return userService.page(page);
    }



    /**
     * 测试事物
     * http://localhost:8080/user/test_transactional<br>
     * 访问如下并未发现插入数据说明事物可靠！！<br>
     * http://localhost:8080/user/test<br>
     * <br>
     * 启动  Application 加上 @EnableTransactionManagement 注解其实可无默认貌似就开启了<br>
     * 需要事物的方法加上 @Transactional 必须的哦！！
     */
    @Transactional
    @GetMapping("/test_transactional")
    public void testTransactional() {
        userService.save(new User(1000L, "测试事物", AgeEnum.ONE, 3,1));
        System.out.println(" 这里手动抛出异常，自动回滚数据");
        throw new RuntimeException();
    }
}
