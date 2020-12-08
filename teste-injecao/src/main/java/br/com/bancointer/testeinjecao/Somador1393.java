package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1393")
public class Somador1393 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
