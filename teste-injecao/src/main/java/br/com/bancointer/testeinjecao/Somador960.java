package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador960")
public class Somador960 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
