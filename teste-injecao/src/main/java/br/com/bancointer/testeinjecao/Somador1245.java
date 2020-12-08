package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1245")
public class Somador1245 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
