package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador692")
public class Somador692 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
