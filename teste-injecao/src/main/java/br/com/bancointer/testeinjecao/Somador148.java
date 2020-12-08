package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador148")
public class Somador148 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
