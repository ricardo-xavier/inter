package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador745")
public class Somador745 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
