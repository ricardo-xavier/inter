package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador2016")
public class Somador2016 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
