package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador60")
public class Somador60 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
