package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1671")
public class Somador1671 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
