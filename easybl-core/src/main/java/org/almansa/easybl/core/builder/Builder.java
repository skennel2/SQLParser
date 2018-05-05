package org.almansa.easybl.core.builder;

import org.almansa.easybl.core.sql.SqlStatement;

public interface Builder<T extends SqlStatement> {
    T bulid();
}
