package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador42")
public class Somador42 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
