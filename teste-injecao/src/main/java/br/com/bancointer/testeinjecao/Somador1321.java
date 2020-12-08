package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1321")
public class Somador1321 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
