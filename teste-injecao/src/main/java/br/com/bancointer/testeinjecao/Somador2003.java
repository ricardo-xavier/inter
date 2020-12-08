package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador2003")
public class Somador2003 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
