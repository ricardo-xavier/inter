package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador256")
public class Somador256 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
