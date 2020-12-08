package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1627")
public class Somador1627 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
