package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1107")
public class Somador1107 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
