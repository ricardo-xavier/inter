package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador162")
public class Somador162 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
