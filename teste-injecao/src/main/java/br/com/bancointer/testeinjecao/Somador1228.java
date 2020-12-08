package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1228")
public class Somador1228 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
