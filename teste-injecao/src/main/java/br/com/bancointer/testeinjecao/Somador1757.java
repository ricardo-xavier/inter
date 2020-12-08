package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1757")
public class Somador1757 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
