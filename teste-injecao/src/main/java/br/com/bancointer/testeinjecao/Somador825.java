package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador825")
public class Somador825 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
