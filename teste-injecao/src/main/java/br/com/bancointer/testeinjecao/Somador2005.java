package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador2005")
public class Somador2005 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
