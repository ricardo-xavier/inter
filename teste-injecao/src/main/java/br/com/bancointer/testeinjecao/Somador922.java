package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador922")
public class Somador922 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
