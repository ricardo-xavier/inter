package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador562")
public class Somador562 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
