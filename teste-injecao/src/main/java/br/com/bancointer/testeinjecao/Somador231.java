package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador231")
public class Somador231 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
