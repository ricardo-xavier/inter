package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador720")
public class Somador720 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
