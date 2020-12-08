package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador479")
public class Somador479 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
