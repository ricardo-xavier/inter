package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador978")
public class Somador978 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
