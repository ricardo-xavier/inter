package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador685")
public class Somador685 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
