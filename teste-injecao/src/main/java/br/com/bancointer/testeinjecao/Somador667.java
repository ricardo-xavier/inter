package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador667")
public class Somador667 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
