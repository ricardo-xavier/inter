package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador424")
public class Somador424 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
