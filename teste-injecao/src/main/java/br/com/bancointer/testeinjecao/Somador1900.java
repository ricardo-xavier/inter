package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1900")
public class Somador1900 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
