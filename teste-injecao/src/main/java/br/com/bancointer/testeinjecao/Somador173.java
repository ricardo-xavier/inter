package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador173")
public class Somador173 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
