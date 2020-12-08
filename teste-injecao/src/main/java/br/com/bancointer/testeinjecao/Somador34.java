package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador34")
public class Somador34 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
