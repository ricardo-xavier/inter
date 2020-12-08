package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador642")
public class Somador642 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
