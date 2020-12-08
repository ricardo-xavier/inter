package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador471")
public class Somador471 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
