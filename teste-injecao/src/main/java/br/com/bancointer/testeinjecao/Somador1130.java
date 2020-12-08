package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1130")
public class Somador1130 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
