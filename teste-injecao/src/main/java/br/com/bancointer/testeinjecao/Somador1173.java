package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1173")
public class Somador1173 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
