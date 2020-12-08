package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1889")
public class Somador1889 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
