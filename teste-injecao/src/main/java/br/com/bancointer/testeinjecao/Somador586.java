package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador586")
public class Somador586 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
