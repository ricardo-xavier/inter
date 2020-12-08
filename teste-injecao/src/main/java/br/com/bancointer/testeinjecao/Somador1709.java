package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1709")
public class Somador1709 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
