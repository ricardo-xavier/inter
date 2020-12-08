package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1761")
public class Somador1761 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
