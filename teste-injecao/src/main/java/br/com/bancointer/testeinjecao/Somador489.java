package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador489")
public class Somador489 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
