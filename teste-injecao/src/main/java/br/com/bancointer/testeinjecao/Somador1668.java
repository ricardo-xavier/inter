package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1668")
public class Somador1668 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
