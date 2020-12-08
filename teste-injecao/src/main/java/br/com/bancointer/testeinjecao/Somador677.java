package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador677")
public class Somador677 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
