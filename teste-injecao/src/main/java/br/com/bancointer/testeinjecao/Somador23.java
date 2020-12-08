package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador23")
public class Somador23 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
