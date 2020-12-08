package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador259")
public class Somador259 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
