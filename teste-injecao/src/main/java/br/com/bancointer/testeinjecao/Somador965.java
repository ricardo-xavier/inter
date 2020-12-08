package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador965")
public class Somador965 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
