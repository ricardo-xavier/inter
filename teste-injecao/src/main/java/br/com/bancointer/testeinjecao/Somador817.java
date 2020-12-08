package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador817")
public class Somador817 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
