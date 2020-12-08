package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1854")
public class Somador1854 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
