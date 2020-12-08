package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador314")
public class Somador314 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
