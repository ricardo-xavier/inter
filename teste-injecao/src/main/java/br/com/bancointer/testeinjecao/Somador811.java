package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador811")
public class Somador811 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
