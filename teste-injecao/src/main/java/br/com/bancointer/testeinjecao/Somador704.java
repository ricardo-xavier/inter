package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador704")
public class Somador704 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
