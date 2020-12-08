package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador856")
public class Somador856 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
