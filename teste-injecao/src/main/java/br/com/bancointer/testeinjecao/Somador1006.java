package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1006")
public class Somador1006 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
