package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador228")
public class Somador228 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
