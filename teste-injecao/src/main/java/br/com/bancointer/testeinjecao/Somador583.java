package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador583")
public class Somador583 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
