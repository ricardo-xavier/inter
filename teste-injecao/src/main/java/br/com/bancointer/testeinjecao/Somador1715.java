package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1715")
public class Somador1715 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
