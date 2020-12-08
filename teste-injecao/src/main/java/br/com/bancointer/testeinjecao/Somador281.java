package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador281")
public class Somador281 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
