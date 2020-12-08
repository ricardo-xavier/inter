package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1304")
public class Somador1304 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
