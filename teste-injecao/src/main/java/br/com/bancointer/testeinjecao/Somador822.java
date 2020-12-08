package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador822")
public class Somador822 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
