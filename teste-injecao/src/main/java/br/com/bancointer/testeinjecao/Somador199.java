package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador199")
public class Somador199 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
