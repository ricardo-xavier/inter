package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1561")
public class Somador1561 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
