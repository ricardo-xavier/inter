package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1691")
public class Somador1691 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
