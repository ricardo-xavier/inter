package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador28")
public class Somador28 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
