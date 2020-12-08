package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador386")
public class Somador386 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
