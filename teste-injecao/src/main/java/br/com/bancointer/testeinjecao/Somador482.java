package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador482")
public class Somador482 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
