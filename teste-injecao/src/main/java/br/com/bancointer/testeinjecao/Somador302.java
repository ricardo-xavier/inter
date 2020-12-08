package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador302")
public class Somador302 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
