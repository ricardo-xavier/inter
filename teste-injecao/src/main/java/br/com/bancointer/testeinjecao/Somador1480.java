package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1480")
public class Somador1480 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
