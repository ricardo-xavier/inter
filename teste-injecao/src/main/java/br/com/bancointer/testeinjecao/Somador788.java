package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador788")
public class Somador788 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
