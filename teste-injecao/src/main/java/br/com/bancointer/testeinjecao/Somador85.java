package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador85")
public class Somador85 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
