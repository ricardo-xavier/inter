package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1341")
public class Somador1341 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
