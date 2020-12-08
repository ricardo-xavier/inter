package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1555")
public class Somador1555 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
