package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador491")
public class Somador491 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
