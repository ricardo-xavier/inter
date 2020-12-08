package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador599")
public class Somador599 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
