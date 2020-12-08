package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1479")
public class Somador1479 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
