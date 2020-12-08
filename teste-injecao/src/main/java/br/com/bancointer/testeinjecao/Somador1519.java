package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1519")
public class Somador1519 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
