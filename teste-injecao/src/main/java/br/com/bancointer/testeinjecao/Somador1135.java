package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1135")
public class Somador1135 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
