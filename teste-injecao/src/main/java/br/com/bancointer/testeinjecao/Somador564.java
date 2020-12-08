package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador564")
public class Somador564 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
