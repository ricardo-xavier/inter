package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador832")
public class Somador832 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
