package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador585")
public class Somador585 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
