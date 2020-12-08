package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador214")
public class Somador214 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
