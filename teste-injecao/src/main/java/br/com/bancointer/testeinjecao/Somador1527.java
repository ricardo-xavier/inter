package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1527")
public class Somador1527 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
