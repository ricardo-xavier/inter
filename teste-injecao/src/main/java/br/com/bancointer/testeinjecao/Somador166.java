package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador166")
public class Somador166 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
