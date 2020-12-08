package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador46")
public class Somador46 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
