package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador798")
public class Somador798 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
