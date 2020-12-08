package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador972")
public class Somador972 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
