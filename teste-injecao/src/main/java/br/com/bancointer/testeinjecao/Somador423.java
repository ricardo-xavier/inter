package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador423")
public class Somador423 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
