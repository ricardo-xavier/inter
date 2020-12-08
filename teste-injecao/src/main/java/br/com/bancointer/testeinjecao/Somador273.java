package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador273")
public class Somador273 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
