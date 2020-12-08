package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador886")
public class Somador886 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
