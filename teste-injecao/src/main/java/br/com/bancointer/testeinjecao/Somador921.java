package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador921")
public class Somador921 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
