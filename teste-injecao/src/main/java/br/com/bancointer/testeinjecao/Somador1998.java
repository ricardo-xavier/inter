package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1998")
public class Somador1998 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
