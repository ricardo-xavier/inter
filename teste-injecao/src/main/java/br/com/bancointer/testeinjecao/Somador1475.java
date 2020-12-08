package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1475")
public class Somador1475 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
