package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador888")
public class Somador888 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
