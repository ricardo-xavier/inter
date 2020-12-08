package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1046")
public class Somador1046 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
