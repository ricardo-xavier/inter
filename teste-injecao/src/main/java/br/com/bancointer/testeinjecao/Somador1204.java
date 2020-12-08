package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1204")
public class Somador1204 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
