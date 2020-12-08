package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador420")
public class Somador420 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
