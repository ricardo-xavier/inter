package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1404")
public class Somador1404 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
