package com.dragontalker.spring5.factorybean;

import org.springframework.beans.factory.FactoryBean;

public class MyBean implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
