package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1032")
public class Somador1032 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
