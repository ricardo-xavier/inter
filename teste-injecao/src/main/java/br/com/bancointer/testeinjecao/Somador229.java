package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador229")
public class Somador229 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
