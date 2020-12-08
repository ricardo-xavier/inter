package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador639")
public class Somador639 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
