package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador793")
public class Somador793 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
