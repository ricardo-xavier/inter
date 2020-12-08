package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador634")
public class Somador634 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
