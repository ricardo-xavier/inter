package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador291")
public class Somador291 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
