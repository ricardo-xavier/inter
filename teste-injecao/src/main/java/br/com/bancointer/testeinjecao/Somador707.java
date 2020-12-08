package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador707")
public class Somador707 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
