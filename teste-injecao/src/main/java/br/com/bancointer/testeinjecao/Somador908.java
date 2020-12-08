package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador908")
public class Somador908 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
