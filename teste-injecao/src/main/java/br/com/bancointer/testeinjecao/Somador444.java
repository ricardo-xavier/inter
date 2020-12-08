package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador444")
public class Somador444 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
