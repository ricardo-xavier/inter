package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador2002")
public class Somador2002 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
