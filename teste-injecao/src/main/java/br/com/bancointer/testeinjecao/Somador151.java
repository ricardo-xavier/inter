package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador151")
public class Somador151 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
