package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador575")
public class Somador575 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
