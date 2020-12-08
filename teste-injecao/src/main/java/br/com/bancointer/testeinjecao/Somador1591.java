package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1591")
public class Somador1591 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
