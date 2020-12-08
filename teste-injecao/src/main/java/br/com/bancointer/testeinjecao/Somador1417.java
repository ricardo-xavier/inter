package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1417")
public class Somador1417 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
