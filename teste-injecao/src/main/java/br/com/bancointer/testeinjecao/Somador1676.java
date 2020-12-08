package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1676")
public class Somador1676 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
