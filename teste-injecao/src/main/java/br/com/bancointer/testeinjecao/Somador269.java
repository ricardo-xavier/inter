package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador269")
public class Somador269 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
