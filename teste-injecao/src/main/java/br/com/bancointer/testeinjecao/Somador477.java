package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador477")
public class Somador477 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
