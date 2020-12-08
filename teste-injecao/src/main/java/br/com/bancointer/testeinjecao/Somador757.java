package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador757")
public class Somador757 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
