package org.almansa.easybl.core.sql;

public abstract class SqlStatement {
    private String statement;

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }
}
