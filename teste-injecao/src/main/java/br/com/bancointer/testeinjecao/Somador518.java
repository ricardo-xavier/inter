package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador518")
public class Somador518 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
