package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1737")
public class Somador1737 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
