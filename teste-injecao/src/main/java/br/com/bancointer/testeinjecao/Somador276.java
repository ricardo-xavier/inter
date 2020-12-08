package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador276")
public class Somador276 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
