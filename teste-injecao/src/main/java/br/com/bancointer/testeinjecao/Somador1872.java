package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1872")
public class Somador1872 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
