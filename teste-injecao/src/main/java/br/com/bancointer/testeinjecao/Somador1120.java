package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1120")
public class Somador1120 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
