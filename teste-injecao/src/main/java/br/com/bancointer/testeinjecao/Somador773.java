package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador773")
public class Somador773 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
