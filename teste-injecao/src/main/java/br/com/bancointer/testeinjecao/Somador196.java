package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador196")
public class Somador196 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
