package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1437")
public class Somador1437 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
