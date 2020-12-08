package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador138")
public class Somador138 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
