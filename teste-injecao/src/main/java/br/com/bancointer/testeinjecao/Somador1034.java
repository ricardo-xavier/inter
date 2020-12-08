package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1034")
public class Somador1034 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
