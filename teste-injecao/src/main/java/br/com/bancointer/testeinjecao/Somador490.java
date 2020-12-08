package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador490")
public class Somador490 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
