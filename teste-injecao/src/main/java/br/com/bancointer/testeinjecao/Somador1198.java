package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1198")
public class Somador1198 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
