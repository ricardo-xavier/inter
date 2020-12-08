package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1773")
public class Somador1773 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
