package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador331")
public class Somador331 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
