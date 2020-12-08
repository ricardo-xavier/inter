package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1886")
public class Somador1886 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
