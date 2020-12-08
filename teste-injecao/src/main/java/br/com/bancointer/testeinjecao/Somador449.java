package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador449")
public class Somador449 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
