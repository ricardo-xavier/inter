package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador553")
public class Somador553 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
