package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador991")
public class Somador991 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
