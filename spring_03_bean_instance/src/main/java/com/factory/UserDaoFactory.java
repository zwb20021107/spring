/*
 * *
 *  @projectName ${PROJECT_NAME}
 *  @package ${PACKAGE_NAME}
 *  @className ${PACKAGE_NAME}.${NAME}
 *  @copyright Copyright 2020 Thunisoft, Inc All rights reserved.
 * /
 */

package com.factory;

import com.dao.UserDao;
import com.dao.impl.UserImpl;
import org.springframework.beans.factory.FactoryBean;

public class UserDaoFactory  implements FactoryBean<UserDao> {

    // 代替原始创建对象的方法
    @Override
    public UserDao getObject() throws Exception {
        return new UserImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }
    @Override
    public boolean isSingleton(){
        return false;
    }
}
