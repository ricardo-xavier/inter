package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador194")
public class Somador194 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
