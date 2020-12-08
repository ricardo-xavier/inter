package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador726")
public class Somador726 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
