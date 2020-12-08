package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1407")
public class Somador1407 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
