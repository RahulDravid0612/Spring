package com.example.Spring.Spring.cdi;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.inject.Scope;

@Component
public class SomeCdiBusiness {
    @Autowired
    SomeCdiDeo someCdiDeo;

    public SomeCdiDeo getSomeCdiDeo() {
        return someCdiDeo;
    }

    public void setSomeCdiDeo(SomeCdiDeo someCdiDeo) {
        this.someCdiDeo = someCdiDeo;
    }
}
