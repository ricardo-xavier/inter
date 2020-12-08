package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1586")
public class Somador1586 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
