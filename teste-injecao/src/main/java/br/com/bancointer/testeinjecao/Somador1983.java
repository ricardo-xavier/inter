package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1983")
public class Somador1983 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
