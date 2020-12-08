package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1318")
public class Somador1318 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
