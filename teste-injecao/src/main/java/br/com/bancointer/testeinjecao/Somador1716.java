package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1716")
public class Somador1716 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
