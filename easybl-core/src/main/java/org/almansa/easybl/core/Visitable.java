package org.almansa.easybl.core;

public interface Visitable {
    void accept(Visitor visitor);
}
