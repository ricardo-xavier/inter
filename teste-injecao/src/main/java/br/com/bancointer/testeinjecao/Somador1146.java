package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1146")
public class Somador1146 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
