package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1208")
public class Somador1208 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
