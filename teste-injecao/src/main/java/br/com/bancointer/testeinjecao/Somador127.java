package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador127")
public class Somador127 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
