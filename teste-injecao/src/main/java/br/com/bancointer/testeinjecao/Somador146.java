package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador146")
public class Somador146 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
