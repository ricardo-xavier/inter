package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1730")
public class Somador1730 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
