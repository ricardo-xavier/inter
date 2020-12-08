package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador247")
public class Somador247 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
