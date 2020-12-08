package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1942")
public class Somador1942 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
