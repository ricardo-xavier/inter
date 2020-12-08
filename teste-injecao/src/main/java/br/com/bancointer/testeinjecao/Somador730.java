package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador730")
public class Somador730 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
