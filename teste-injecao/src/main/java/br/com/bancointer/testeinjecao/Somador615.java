package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador615")
public class Somador615 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
