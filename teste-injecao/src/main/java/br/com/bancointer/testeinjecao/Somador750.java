package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador750")
public class Somador750 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
