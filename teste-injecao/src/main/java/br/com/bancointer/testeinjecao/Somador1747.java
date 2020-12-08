package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1747")
public class Somador1747 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
