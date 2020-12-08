package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador252")
public class Somador252 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
