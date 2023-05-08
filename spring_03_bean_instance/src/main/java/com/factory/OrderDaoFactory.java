/*
 * *
 *  @projectName ${PROJECT_NAME}
 *  @package ${PACKAGE_NAME}
 *  @className ${PACKAGE_NAME}.${NAME}
 *  @copyright Copyright 2020 Thunisoft, Inc All rights reserved.
 * /
 */

package com.factory;

import com.dao.OrderDao;
import com.dao.impl.OrderImpl;

public class OrderDaoFactory {
    public static OrderDao getOrderDao(){
        return new OrderImpl();
    }
}
