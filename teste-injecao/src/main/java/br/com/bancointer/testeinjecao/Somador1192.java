package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1192")
public class Somador1192 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
