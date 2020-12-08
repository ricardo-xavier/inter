package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador526")
public class Somador526 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
