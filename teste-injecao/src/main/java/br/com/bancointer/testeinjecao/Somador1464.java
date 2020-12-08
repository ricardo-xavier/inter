package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1464")
public class Somador1464 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
