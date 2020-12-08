package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador24")
public class Somador24 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
