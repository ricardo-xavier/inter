package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1243")
public class Somador1243 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
