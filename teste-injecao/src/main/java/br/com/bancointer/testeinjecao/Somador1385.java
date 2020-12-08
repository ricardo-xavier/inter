package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1385")
public class Somador1385 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
