package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1941")
public class Somador1941 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
