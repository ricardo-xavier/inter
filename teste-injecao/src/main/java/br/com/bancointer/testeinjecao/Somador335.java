package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador335")
public class Somador335 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
