package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1692")
public class Somador1692 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
