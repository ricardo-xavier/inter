package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador463")
public class Somador463 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
