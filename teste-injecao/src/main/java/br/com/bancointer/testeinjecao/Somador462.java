package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador462")
public class Somador462 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
