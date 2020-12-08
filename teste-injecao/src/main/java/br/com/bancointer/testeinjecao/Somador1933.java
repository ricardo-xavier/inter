package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1933")
public class Somador1933 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
