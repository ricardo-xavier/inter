package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador192")
public class Somador192 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
