package com.example.implementation;

import com.example.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BridgestongTyres implements Tyres {
    @Override
    public String rotateMethod() {
        return "rotate with bridgestong tryes";
    }
}
