package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1895")
public class Somador1895 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
