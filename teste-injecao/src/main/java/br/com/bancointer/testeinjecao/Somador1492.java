package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1492")
public class Somador1492 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
