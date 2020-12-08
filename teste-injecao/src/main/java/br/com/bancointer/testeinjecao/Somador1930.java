package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1930")
public class Somador1930 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
