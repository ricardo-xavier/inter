package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1876")
public class Somador1876 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
