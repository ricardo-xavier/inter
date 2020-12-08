package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador89")
public class Somador89 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
