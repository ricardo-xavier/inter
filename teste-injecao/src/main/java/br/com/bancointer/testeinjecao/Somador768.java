package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador768")
public class Somador768 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
