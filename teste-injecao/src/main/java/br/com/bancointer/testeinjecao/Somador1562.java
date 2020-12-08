package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1562")
public class Somador1562 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
