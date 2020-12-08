package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1988")
public class Somador1988 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
