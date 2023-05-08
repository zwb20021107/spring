/*
 * *
 *  @projectName ${PROJECT_NAME}
 *  @package ${PACKAGE_NAME}
 *  @className ${PACKAGE_NAME}.${NAME}
 *  @copyright Copyright 2020 Thunisoft, Inc All rights reserved.
 * /
 */

package com.dao.impl;

import com.dao.UserDao;

public class UserImpl implements UserDao {
    public void save()
    {
        System.out.println("UserDao is saving");
    }
}
