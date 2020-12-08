package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador694")
public class Somador694 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
