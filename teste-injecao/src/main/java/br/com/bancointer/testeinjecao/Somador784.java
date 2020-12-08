package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador784")
public class Somador784 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
