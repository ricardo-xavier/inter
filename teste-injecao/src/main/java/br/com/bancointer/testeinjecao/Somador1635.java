package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1635")
public class Somador1635 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
