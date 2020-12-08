package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1077")
public class Somador1077 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
