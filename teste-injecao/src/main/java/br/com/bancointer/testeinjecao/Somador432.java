package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador432")
public class Somador432 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
