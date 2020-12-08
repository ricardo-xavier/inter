package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1306")
public class Somador1306 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
