package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador927")
public class Somador927 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
