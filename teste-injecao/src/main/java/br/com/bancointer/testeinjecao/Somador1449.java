package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1449")
public class Somador1449 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
