package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador906")
public class Somador906 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
