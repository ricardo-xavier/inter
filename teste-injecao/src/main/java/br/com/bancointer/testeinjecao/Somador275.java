package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador275")
public class Somador275 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
