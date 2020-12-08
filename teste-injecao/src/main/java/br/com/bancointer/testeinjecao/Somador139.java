package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador139")
public class Somador139 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
