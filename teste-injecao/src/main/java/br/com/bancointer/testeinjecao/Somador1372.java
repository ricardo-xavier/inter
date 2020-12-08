package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1372")
public class Somador1372 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
