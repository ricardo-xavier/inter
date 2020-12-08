package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador20")
public class Somador20 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
