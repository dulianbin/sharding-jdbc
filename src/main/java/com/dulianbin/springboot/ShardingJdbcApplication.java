package com.dulianbin.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * mybatis-plus Spring Boot 测试 Demo<br>
 * 文档：http://mp.baomidou.com<br>
 */
@EnableTransactionManagement
@SpringBootApplication
public class ShardingJdbcApplication {

    protected final static Logger logger = LoggerFactory.getLogger(ShardingJdbcApplication.class);
    private static final  String BANNER = ""+
            "				  _oo0oo_\n" +
            "                 o8888888o\n" +
            "                 88\" . \"88\n" +
            "                 (| -_- |)\n" +
            "                 0\\  =  /0\n" +
            "               ___/`---'\\___\n" +
            "             .' \\\\|     |// '.\n" +
            "            / \\\\|||  :  |||// \\\n" +
            "           / _||||| -:- |||||- \\\n" +
            "          |   | \\\\\\  -  /// |   |\n" +
            "          | \\_|  ''\\---/''  |_/ |\n" +
            "          \\  .-\\__  '-'  ___/-. /\n" +
            "        ___'. .'  /--.--\\  `. .'___\n" +
            "     .\"\" '<  `.___\\_<|>_/___.' >' \"\".\n" +
            "    | | :  `- \\`.;`\\ _ /`;.`/ - ` : | |\n" +
            "    \\  \\ `_.   \\_ __\\ /__ _/   .-` /  /\n" +
            "=====`-.____`.___ \\_____/___.-`___.-'=====\n" +
            "                  `=---='\n" +
            "\n" +
            "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
            "\n" +
            "          佛祖保佑         永无BUG\n" +
            "\n" +
            "     佛曰:\n" +
            "         写字楼里写字间，写字间里程序员；\n" +
            "         程序人员写程序，又拿程序换酒钱。\n" +
            "         酒醒只在网上坐，酒醉还来网下眠；\n" +
            "         酒醉酒醒日复日，网上网下年复年。\n" +
            "         但愿老死电脑间，不愿鞠躬老板前；\n" +
            "         奔驰宝马贵者趣，公交自行程序员。\n" +
            "         别人笑我忒疯癫，我笑自己命太贱；\n" +
            "         不见满街漂亮妹，哪个归得程序员？\n" +
            "         ***好啦！别看了，启动成功！**** ";
    /**
     * <p>
     * 测试 RUN<br>
     * 查看 h2 数据库控制台：http://localhost:8080/console<br>
     * 使用：JDBC URL 设置 jdbc:h2:mem:testdb 用户名 sa 密码 sa 进入，可视化查看 user 表<br>
     * 误删连接设置，开发机系统本地 ~/.h2.server.properties 文件<br>
     * <br>
     * 1、http://localhost:8080/user/test<br>
     * 2、http://localhost:8080/user/test1<br>
     * 3、http://localhost:8080/user/test2<br>
     * 4、http://localhost:8080/user/test3<br>
     * 5、http://localhost:8080/user/add<br>
     * 6、http://localhost:8080/user/selectsql<br>
     * 7、分页 size 一页显示数量  current 当前页码
     * 方式一：http://localhost:8080/user/page?size=1&current=1<br>
     * 方式二：http://localhost:8080/user/pagehelper?size=1&current=1<br>
     * </p>
     */
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ShardingJdbcApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
        //logger.info("application is success!");
        System.out.println(BANNER);
    }

}
