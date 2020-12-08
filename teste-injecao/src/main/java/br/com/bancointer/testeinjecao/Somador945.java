package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador945")
public class Somador945 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
