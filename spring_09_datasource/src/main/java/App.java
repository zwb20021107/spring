/*
 * *
 *  @projectName ${PROJECT_NAME}
 *  @package ${PACKAGE_NAME}
 *  @className ${PACKAGE_NAME}.${NAME}
 *  @copyright Copyright 2020 Thunisoft, Inc All rights reserved.
 * /
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class App {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource = (DataSource) ctx.getBean("dataSource");
        System.out.println(dataSource);
    }
}
