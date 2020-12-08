package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador71")
public class Somador71 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
