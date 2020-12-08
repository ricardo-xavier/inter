package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1706")
public class Somador1706 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
