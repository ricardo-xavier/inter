package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador589")
public class Somador589 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
