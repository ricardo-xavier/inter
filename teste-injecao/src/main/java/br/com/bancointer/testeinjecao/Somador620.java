package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador620")
public class Somador620 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
