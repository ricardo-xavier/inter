package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador336")
public class Somador336 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
