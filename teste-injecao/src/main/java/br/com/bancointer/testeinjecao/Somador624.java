package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador624")
public class Somador624 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
