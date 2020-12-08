package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador998")
public class Somador998 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
