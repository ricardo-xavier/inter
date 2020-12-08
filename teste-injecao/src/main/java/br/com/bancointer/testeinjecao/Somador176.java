package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador176")
public class Somador176 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
