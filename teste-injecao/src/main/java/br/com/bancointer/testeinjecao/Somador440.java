package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador440")
public class Somador440 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
