package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador863")
public class Somador863 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
