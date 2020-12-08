package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador529")
public class Somador529 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
