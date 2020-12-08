package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador337")
public class Somador337 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
