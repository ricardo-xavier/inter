package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1061")
public class Somador1061 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
