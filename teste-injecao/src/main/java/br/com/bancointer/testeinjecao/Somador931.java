package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador931")
public class Somador931 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
