package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador777")
public class Somador777 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
