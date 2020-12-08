package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1806")
public class Somador1806 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
