package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1912")
public class Somador1912 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
