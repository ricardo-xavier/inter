package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador167")
public class Somador167 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
