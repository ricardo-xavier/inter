package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1821")
public class Somador1821 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
