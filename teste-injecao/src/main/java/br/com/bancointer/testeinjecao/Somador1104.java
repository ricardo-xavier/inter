package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1104")
public class Somador1104 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
