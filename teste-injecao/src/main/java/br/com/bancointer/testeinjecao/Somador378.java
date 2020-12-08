package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador378")
public class Somador378 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
