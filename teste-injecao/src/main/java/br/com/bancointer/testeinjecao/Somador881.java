package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador881")
public class Somador881 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
