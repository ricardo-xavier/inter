package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1148")
public class Somador1148 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
