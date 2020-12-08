package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1380")
public class Somador1380 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
