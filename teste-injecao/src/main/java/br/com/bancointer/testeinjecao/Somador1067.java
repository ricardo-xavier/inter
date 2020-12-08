package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1067")
public class Somador1067 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
