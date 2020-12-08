package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador952")
public class Somador952 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
