package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador227")
public class Somador227 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
