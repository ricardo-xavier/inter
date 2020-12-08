package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador145")
public class Somador145 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
