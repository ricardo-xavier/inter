package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador205")
public class Somador205 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
