package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador790")
public class Somador790 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
