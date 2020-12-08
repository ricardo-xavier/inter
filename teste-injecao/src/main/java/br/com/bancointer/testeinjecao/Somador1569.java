package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1569")
public class Somador1569 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
