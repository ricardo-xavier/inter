package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1361")
public class Somador1361 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
