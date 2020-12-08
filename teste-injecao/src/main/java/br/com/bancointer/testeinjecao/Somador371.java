package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador371")
public class Somador371 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
