package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador802")
public class Somador802 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
