package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador752")
public class Somador752 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
