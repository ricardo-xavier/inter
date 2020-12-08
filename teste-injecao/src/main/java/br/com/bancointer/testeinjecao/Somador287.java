package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador287")
public class Somador287 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
