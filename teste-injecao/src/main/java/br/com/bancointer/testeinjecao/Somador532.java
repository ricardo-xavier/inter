package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador532")
public class Somador532 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
