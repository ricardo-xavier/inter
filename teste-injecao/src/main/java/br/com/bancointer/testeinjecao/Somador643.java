package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador643")
public class Somador643 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
