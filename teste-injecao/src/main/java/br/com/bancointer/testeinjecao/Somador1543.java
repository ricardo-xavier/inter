package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1543")
public class Somador1543 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
