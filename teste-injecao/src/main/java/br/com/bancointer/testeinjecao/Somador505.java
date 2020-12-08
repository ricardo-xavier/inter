package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador505")
public class Somador505 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
