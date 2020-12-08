package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1370")
public class Somador1370 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
