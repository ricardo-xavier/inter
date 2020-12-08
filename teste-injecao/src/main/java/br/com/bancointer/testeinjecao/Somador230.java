package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador230")
public class Somador230 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
