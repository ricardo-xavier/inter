package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador935")
public class Somador935 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
