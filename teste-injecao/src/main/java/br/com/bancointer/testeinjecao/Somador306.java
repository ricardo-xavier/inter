package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador306")
public class Somador306 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
