package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador263")
public class Somador263 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
