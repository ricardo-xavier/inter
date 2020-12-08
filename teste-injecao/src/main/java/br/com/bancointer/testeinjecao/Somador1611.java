package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1611")
public class Somador1611 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
