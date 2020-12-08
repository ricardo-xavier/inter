package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador191")
public class Somador191 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
