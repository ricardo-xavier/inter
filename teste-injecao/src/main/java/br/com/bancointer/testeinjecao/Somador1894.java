package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1894")
public class Somador1894 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
