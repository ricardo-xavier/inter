package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1999")
public class Somador1999 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
