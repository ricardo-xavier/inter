package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador498")
public class Somador498 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
