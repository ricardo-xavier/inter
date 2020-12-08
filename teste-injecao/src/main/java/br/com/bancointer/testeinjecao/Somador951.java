package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador951")
public class Somador951 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
