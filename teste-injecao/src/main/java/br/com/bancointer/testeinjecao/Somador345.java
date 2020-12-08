package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador345")
public class Somador345 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
