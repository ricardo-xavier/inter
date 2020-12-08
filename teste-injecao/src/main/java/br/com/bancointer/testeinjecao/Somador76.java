package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador76")
public class Somador76 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
