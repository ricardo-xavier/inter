package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1508")
public class Somador1508 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
