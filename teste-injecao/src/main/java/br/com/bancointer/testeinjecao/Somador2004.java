package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador2004")
public class Somador2004 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
