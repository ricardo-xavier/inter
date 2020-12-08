package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1504")
public class Somador1504 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
