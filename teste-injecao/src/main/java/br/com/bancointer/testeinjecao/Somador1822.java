package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1822")
public class Somador1822 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
