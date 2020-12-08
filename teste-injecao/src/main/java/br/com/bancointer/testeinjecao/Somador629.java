package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador629")
public class Somador629 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
