package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador812")
public class Somador812 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
