package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1481")
public class Somador1481 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
