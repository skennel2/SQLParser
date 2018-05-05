package org.almansa.easybl.core.sql;

import java.util.List;

public class Select extends ReservedStatement{
    private List<SelectField> fields;

    public List<SelectField> getFields() {
        return fields;
    }

    public void setFields(List<SelectField> fields) {
        this.fields = fields;
    }
}
