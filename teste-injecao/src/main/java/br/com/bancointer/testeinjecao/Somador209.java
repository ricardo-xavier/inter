package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador209")
public class Somador209 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
