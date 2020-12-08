package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador959")
public class Somador959 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
