package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador390")
public class Somador390 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
