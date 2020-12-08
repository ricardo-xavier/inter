package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador33")
public class Somador33 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
