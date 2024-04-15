package com.example.implementation;

import com.example.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class BridgestongTyres implements Tyres {
    @Override
    public String rotateMethod() {
        return "rotate with bridgestong tryes";
    }
}
