package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1587")
public class Somador1587 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
