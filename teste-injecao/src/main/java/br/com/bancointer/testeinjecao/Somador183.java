package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador183")
public class Somador183 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
