package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1477")
public class Somador1477 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
