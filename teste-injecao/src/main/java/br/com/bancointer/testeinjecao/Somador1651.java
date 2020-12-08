package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1651")
public class Somador1651 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
