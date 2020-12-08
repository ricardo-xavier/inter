package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1581")
public class Somador1581 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
