package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1086")
public class Somador1086 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
