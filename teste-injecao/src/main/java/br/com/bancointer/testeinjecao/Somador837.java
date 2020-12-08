package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador837")
public class Somador837 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
