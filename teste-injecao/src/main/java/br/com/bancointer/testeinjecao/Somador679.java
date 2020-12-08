package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador679")
public class Somador679 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
