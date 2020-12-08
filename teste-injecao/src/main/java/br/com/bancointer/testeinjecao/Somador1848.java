package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1848")
public class Somador1848 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
