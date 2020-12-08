package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1300")
public class Somador1300 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
