package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1909")
public class Somador1909 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
