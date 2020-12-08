package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador638")
public class Somador638 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
