package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1366")
public class Somador1366 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
