package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1922")
public class Somador1922 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
