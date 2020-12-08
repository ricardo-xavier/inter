package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador742")
public class Somador742 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
