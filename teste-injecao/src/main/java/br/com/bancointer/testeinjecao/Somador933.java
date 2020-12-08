package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador933")
public class Somador933 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
