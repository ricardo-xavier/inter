package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador58")
public class Somador58 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
