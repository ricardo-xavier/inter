package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador367")
public class Somador367 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
