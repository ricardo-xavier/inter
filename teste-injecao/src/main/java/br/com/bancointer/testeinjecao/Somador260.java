package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador260")
public class Somador260 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
