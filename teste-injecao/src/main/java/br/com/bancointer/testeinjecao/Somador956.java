package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador956")
public class Somador956 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
