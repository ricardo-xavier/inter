package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1534")
public class Somador1534 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
