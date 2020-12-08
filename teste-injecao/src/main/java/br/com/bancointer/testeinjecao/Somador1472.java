package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1472")
public class Somador1472 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
