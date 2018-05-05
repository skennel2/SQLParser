package org.almansa.easybl.core.builder;

import java.util.ArrayList;
import java.util.List;

import org.almansa.easybl.core.sql.Select;
import org.almansa.easybl.core.sql.SelectField;
import org.almansa.easybl.core.sql.TextSelectFields;

public class ANSISelectBuilder implements Builder<Select>{
    
    private List<SelectField> fields = new ArrayList<>();
    
    public ANSISelectBuilder addField(SelectField field) {
        fields.add(field);
        
        return this;
    }
    
    public ANSISelectBuilder addText(String value, String alias) throws Exception {
        TextSelectFields field = new TextSelectFields();
        field.setValue(value);
        field.setAlias(alias);
        
        field.setStatement("'" + value + "'" + " as " + alias);
        fields.add(field);
        
        return this;
    }
    
    @Override
    public Select bulid() {

        return null;
    }

}
