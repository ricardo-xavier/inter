package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador855")
public class Somador855 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
