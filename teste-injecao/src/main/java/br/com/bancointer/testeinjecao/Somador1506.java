package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1506")
public class Somador1506 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
