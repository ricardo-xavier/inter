package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1167")
public class Somador1167 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
