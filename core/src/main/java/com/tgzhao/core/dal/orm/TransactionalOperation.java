package com.tgzhao.core.dal.orm;

import java.sql.Connection;

/**
 * Created by tgzhao on 16/7/17.
 */
public interface TransactionalOperation<T> {

    T doInConnection(Connection conn);

}
