package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1218")
public class Somador1218 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
