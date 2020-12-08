package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1074")
public class Somador1074 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
