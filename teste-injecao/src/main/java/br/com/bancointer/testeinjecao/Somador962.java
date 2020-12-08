package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador962")
public class Somador962 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
