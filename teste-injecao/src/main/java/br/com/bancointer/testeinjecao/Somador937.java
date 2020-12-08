package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador937")
public class Somador937 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
