package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador301")
public class Somador301 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
