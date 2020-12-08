package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1788")
public class Somador1788 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
