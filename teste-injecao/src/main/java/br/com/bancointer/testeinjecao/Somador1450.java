package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1450")
public class Somador1450 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
