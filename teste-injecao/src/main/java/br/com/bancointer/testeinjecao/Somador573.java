package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador573")
public class Somador573 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
