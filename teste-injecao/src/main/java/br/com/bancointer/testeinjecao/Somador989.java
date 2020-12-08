package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador989")
public class Somador989 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
