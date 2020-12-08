package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador354")
public class Somador354 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
