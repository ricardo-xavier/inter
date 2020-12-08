package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1520")
public class Somador1520 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
