package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador796")
public class Somador796 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
