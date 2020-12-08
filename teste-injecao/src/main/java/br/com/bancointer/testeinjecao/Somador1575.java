package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1575")
public class Somador1575 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
