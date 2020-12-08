package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador901")
public class Somador901 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
