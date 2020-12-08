package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador806")
public class Somador806 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
