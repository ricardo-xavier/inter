package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador492")
public class Somador492 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
