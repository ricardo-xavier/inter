package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1541")
public class Somador1541 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
