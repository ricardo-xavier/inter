package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador130")
public class Somador130 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
