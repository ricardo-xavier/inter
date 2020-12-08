package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador805")
public class Somador805 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
