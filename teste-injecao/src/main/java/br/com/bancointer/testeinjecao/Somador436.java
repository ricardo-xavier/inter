package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador436")
public class Somador436 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
