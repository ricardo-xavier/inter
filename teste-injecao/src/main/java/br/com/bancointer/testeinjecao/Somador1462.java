package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1462")
public class Somador1462 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
