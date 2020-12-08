package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador61")
public class Somador61 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
