package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1814")
public class Somador1814 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
