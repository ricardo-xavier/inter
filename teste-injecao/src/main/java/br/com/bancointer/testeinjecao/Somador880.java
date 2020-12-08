package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador880")
public class Somador880 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
