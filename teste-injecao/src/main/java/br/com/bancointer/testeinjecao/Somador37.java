package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador37")
public class Somador37 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
