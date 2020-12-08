package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1161")
public class Somador1161 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
