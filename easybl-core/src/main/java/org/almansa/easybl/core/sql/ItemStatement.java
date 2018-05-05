package org.almansa.easybl.core.sql;

public abstract class ItemStatement extends SqlStatement{
    private String alias;

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) throws Exception {
        if(alias.trim().length() != alias.length()) {
            throw new Exception();
        }
        
        this.alias = alias;
    }
}
