package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1835")
public class Somador1835 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
