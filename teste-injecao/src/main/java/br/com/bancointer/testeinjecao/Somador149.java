package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador149")
public class Somador149 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
