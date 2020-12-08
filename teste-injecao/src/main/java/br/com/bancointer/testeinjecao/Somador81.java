package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador81")
public class Somador81 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
