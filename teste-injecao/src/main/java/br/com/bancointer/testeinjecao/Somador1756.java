package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1756")
public class Somador1756 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
