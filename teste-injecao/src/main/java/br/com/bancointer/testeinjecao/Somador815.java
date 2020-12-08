package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador815")
public class Somador815 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
