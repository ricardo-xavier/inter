package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1460")
public class Somador1460 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
