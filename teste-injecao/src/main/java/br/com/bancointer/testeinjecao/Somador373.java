package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador373")
public class Somador373 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
