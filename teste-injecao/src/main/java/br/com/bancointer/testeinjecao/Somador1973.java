package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1973")
public class Somador1973 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
