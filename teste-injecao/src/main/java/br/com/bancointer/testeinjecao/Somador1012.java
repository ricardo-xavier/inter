package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1012")
public class Somador1012 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
