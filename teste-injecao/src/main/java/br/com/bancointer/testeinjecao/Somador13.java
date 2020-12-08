package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador13")
public class Somador13 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
