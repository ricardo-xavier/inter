package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1823")
public class Somador1823 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
