package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1465")
public class Somador1465 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
