package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador717")
public class Somador717 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
