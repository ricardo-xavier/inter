package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1311")
public class Somador1311 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
