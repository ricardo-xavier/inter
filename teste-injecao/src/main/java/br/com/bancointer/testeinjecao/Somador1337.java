package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1337")
public class Somador1337 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
