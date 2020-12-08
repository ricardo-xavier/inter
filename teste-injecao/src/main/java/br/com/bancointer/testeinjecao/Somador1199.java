package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1199")
public class Somador1199 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
