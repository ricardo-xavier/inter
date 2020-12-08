package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador577")
public class Somador577 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
