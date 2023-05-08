/*
 * *
 *  @projectName ${PROJECT_NAME}
 *  @package ${PACKAGE_NAME}
 *  @className ${PACKAGE_NAME}.${NAME}
 *  @copyright Copyright 2020 Thunisoft, Inc All rights reserved.
 * /
 */

import com.zwb.dao.BookDao;
import com.zwb.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext" +
                "" +
                ".xml");

//        BookDao bookDao= (BookDao)ctx.getBean("BookDao");
//        bookDao.save();

        BookService bookService = (BookService) ctx.getBean("BookService");
        bookService.save();
    }
}
