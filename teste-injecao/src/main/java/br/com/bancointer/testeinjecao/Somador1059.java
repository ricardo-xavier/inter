package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1059")
public class Somador1059 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
