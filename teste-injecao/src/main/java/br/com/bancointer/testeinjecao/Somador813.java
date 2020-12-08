package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador813")
public class Somador813 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
