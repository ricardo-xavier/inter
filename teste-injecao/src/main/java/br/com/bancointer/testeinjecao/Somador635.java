package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador635")
public class Somador635 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
