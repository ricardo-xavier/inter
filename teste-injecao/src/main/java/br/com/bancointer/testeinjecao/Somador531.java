package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador531")
public class Somador531 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
