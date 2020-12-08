package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1322")
public class Somador1322 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
