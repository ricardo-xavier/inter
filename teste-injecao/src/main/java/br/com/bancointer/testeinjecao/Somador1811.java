package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1811")
public class Somador1811 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
