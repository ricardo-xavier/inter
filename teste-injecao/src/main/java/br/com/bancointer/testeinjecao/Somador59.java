package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador59")
public class Somador59 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
