package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador675")
public class Somador675 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
