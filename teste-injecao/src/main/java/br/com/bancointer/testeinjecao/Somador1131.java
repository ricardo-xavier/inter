package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1131")
public class Somador1131 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
