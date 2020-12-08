package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador541")
public class Somador541 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
