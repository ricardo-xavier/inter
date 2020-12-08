package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador447")
public class Somador447 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
