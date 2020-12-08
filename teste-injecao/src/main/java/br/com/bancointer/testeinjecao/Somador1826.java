package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1826")
public class Somador1826 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
