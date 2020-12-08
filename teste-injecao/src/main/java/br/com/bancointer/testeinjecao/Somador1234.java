package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1234")
public class Somador1234 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
