package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador783")
public class Somador783 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
