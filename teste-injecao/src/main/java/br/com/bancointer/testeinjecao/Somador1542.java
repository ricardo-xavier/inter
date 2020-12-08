package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1542")
public class Somador1542 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
