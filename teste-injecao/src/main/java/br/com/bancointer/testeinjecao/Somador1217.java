package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1217")
public class Somador1217 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
