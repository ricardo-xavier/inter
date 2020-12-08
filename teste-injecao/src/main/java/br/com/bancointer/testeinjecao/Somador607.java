package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador607")
public class Somador607 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
