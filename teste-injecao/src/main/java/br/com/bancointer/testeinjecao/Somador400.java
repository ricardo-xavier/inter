package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador400")
public class Somador400 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
