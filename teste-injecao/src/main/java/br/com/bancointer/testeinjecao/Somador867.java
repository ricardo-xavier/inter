package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador867")
public class Somador867 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
