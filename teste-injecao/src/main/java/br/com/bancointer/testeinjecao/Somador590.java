package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador590")
public class Somador590 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
