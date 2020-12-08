package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1908")
public class Somador1908 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
