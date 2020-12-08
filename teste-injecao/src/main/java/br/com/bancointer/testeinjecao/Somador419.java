package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador419")
public class Somador419 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
