/*
 * *
 *  @projectName ${PROJECT_NAME}
 *  @package ${PACKAGE_NAME}
 *  @className ${PACKAGE_NAME}.${NAME}
 *  @copyright Copyright 2020 Thunisoft, Inc All rights reserved.
 * /
 */

package com.zwb.service.impl;

import com.zwb.dao.BookDao;
import com.zwb.dao.impl.BookDaoImpl;
import com.zwb.service.BookService;

public class BookServiceImpl implements BookService {


    private BookDao bookDao;
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}